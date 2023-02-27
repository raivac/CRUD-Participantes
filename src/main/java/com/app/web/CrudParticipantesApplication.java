package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Participante;
import com.app.web.repositorio.ParticipanteRepositorio;

@SpringBootApplication
public class CrudParticipantesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudParticipantesApplication.class, args);
	}
	@Autowired
	private ParticipanteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		/*
		Participante part1 = new Participante("joan","Ivars","club1","palma");
		repositorio.save(part1);
		
		Participante part2 = new Participante("marc","Sanz","club1","gandia");
		repositorio.save(part2);
		
		Participante part3 = new Participante("miquel","Perez","club2","beniarjo");
		repositorio.save(part3);*/
	}

}
