package com.professorangoti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.professorangoti.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	List<Usuario> findByUserStartingWith(String inicio);

}
