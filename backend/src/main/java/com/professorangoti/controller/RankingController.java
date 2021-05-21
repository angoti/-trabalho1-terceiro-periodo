package com.professorangoti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.professorangoti.domain.Ranking;
import com.professorangoti.repository.RankingRepository;

@RestController
@RequestMapping("/ranking")
public class RankingController {

	@Autowired
	private RankingRepository repo;

	@PostMapping
	@CrossOrigin
	Ranking gravaPontuacao(@RequestBody Ranking ranking) {
		return repo.save(ranking);
	}
	
	@GetMapping("/{nivel}")
	List<Ranking> primeirosCincoPorNivel(@PathVariable String nivel){
		return repo.findTop5ByNivelOrderByPontuacaoAsc(nivel);
	}
	
	@GetMapping
	List<Ranking> primeirosCinco(){
		return repo.findTop5ByOrderByPontuacaoDesc();
	}
	
	
		
}
