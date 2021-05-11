package com.professorangoti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.professorangoti.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
