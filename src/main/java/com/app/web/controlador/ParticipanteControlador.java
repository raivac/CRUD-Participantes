package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Participante;
import com.app.web.servicio.ParticipanteServicio;

@Controller
public class ParticipanteControlador {

	@Autowired
	private ParticipanteServicio servicio;

	@GetMapping({ "/participantes", "/" })
	public String listarParticipantes(Model modelo) {
		modelo.addAttribute("participantes", servicio.listarParticipantes());
		return "participantes";
	}

	@GetMapping("/altaparticipante")
	public String formularioParticipante(Model modelo) {
		Participante participante = new Participante();
		modelo.addAttribute("participante", participante);
		return "crear_participante";
	}

	@PostMapping("/participantes")
	public String guardarParticipante(@ModelAttribute("participante") Participante participante) {
		servicio.guardarParticipante(participante);
		return "redirect:/participantes";
	}

	@GetMapping("/participantes/editar/{id}")
	public String formularioEditarParticipante(@PathVariable Long id, Model modelo) {

		modelo.addAttribute("participante", servicio.obtenerParticipante(id));
		return "editar_participante";
	}

	@PostMapping("/participantes/{id}")
	public String actualizarParticipante(@PathVariable Long id,
			@ModelAttribute("participante") Participante participante, Model modelo) {
		Participante participanteExistente = servicio.obtenerParticipante(id);
		participanteExistente.setId(id);
		participanteExistente.setNombre(participante.getNombre());
		participanteExistente.setApellidos(participante.getApellidos());
		participanteExistente.setClub(participante.getClub());
		participanteExistente.setPoblacion(participante.getPoblacion());
		servicio.actualizarParticipante(participanteExistente);
		return "redirect:/participantes";
	}

	@GetMapping("/participantes/{id}")
	public String eliminarParticipante(@PathVariable Long id) {

		servicio.eliminarParticipante(id);
		return "redirect:/participantes";
	}

}
