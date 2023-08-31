package org.generation.elotitos.controller;

import java.util.List;

import org.generation.elotitos.model.ChangePassword;
import org.generation.elotitos.model.Usuario;
import org.generation.elotitos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/// CRUD Create - Read - Update - Delete
/// HTTP POST 	- GET  - PUT	- DELETE

@RestController
@RequestMapping(path = "/api/usuarios/") // http://localhost:8080/api/usuarios/
public class UsuarioController {
	private final UsuarioService usuarioService;

	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}// constructor

	@GetMapping
	public List<Usuario> getAllUsers() {
		return usuarioService.getAllUsuarios();
	}

	@GetMapping(path = "{usuarioId}")
	public Usuario getUser(@PathVariable("usuarioId") Long idusuario) {
		return usuarioService.getUsuario(idusuario);
	}

	@DeleteMapping(path = "{usuarioId}")
	public Usuario deleteUser(@PathVariable("usuarioId") Long idusuario) {
		return usuarioService.deleteUsuario(idusuario);
	}

	@PostMapping
	public Usuario addUser(@RequestBody Usuario usuario) {
		return usuarioService.addUsuario(usuario);
	}

	@PutMapping(path = "{usuarioId}")
	public Usuario putUser(@PathVariable("usuarioId") Long idusuario, @RequestParam(required = false) String nombre,
			@RequestParam(required = false) String correo, @RequestParam(required = false) Long telefono,
			@RequestParam(required = false) String userType, @RequestBody ChangePassword changePassword) {
		return usuarioService.updateUsuario(idusuario, nombre, correo, changePassword, telefono, userType);
	}
}// class ProductoController