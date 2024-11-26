package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	// Endpoint 2: Lista BSM 
		@GetMapping("/bsms")
		public List<String> bsms() {
			return Arrays.asList(
				"Orientação ao futuro",
				"Persistência",
				"Responsabilidade Pessoal",
				"Mentalidade de crescimento",
				"Comunicação",
				"Proatividade",
				"Orientação ao Detalhe",
				"Trabalho em equipe"
			);
		}

		// Endpoint 3: Lista Objetivos
		@GetMapping("/objetivos")
		public List<String> objetivos() {
			return Arrays.asList(
				"Estudar MySQL, rever o que foi passado.",
				"Refazer novamente o projeto Conta.",
				"Estudar Spring nas horas vagas.",
				"Desenvolver o Pitch pessoal."
		);
		
	}
}
 
