package com.professorangoti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.professorangoti.domain.Ranking;

public interface RankingRepository extends JpaRepository<Ranking, Integer>{
	
	List<Ranking> findByNivelOrderByPontuacaoDesc(String nivel);

}
