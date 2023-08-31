package org.generation.elotitos.repository;

import java.util.Optional;

import org.generation.elotitos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Long>{
	Optional<Producto> findByNombre(String nombre);
}//interface ProductoRepository
