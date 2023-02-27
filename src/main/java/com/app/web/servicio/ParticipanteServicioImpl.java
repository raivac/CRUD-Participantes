package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Participante;
import com.app.web.repositorio.ParticipanteRepositorio;

@Service
public class ParticipanteServicioImpl implements ParticipanteServicio {

	@Autowired
	private ParticipanteRepositorio repositorio;

	@Override
	public List<Participante> listarParticipantes() {

		return repositorio.findAll();
	}

	@Override
	public Participante guardarParticipante(Participante participante) {

		return repositorio.save(participante);
	}

	@Override
	public Participante obtenerParticipante(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Participante actualizarParticipante(Participante participante) {

		return repositorio.save(participante);
	}

	@Override
	public void eliminarParticipante(Long id) {
		repositorio.deleteById(id);
	}

}
