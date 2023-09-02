package org.generation.elotitos.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;

import org.generation.elotitos.config.JwtFilter;
import org.generation.elotitos.model.Token;
import org.generation.elotitos.model.Usuario;
import org.generation.elotitos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
//@CrossOrigin(origins="*")
@RequestMapping(path = "/api/login/") // http://localhost:8080/api/login/
public class loginController {
	private final UsuarioService usuarioService;

	@Autowired
	public loginController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}

	@PostMapping
	public Token loginUsuario(@RequestBody Usuario usuario) throws ServletException {
		usuario = usuarioService.validateUsuario(usuario);
		System.out.println(usuario);
		if (usuario != null) {
			return new Token(generateToken(usuario.getCorreo()).concat(usuario.getId().toString()));
		} // if
		throw new ServletException("Nombre de usuario o contraseña incorrectos");
	}// loginUsuario

	private String generateToken(String username) {
		Calendar calendar = Calendar.getInstance();// Fecha hora actual
		calendar.add(Calendar.MINUTE, 30);
		return Jwts.builder().setSubject(username).claim("role", "user").setIssuedAt(new Date())
				.setExpiration(calendar.getTime()).signWith(SignatureAlgorithm.HS256, JwtFilter.secret).compact();
	}// generateToken

}// class loginController
