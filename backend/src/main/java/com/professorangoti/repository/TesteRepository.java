package com.professorangoti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.professorangoti.domain.Teste;

public interface TesteRepository extends JpaRepository<Teste, Integer> {

	List<Teste> findBySobrenome(String sobrenome);
}
