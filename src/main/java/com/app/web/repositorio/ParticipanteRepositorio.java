package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Participante;

@Repository
public interface ParticipanteRepositorio extends JpaRepository<Participante, Long>{

}
