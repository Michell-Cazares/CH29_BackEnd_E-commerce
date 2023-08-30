package org.generation.elotitos.repository;

import java.util.Optional;

import org.generation.elotitos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
	Optional<Usuario> findByCorreo(String correo);
}//interface UsuarioRepository
