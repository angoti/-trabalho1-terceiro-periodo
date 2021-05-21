package com.professorangoti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.professorangoti.domain.Teste;
import com.professorangoti.repository.TesteRepository;

@RestController
@RequestMapping("/teste")
public class TesteController {


	@Autowired
	TesteRepository testeRepository;
	
	@GetMapping("/{sobrenome}")
	List<Teste> teste(@PathVariable String sobrenome){
		return testeRepository.findBySobrenome(sobrenome);
	}
}
