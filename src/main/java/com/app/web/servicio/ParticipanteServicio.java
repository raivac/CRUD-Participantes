package com.app.web.servicio;

import java.util.List;
import com.app.web.entidad.Participante;

public interface ParticipanteServicio {

	public List<Participante> listarParticipantes();
	
	
	public Participante guardarParticipante(Participante participante);
	
	public Participante obtenerParticipante(Long id);
	
	public Participante actualizarParticipante(Participante participante);
	
	public void eliminarParticipante(Long id);
}
