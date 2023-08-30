package org.generation.elotitos.service;

import java.util.List;
import java.util.Optional;

import org.generation.elotitos.model.ChangePassword;
import org.generation.elotitos.model.Usuario;
import org.generation.elotitos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}// constructor

	public List<Usuario> getAllUsuarios() {
		return this.usuarioRepository.findAll();
	}// getAllUsuarios

	public Usuario getUsuario(Long idusuario) {
		return usuarioRepository.findById(idusuario)
				.orElseThrow(() -> new IllegalArgumentException("El Usuario con el id" + idusuario + "] no exixte."));
	}// getUsuario

	public Usuario deleteUsuario(Long idusuario) {
		Usuario tmp = null;
		if (usuarioRepository.existsById(idusuario)) {
			tmp = usuarioRepository.findById(idusuario).get();
			usuarioRepository.deleteById(idusuario);
		}
		return tmp;
	}// deleteUsuario

	public Usuario addUsuario(Usuario usuario) {
		Usuario tmp = null;
		if (usuarioRepository.findByEmail(usuario.getCorreo()).isEmpty()) {
			usuario.setPassword(passwordEncoder.encode(usuario.getPassword())); // cifrar contraseña
			tmp = usuarioRepository.save(usuario);
		} else {
			System.out.println("Ya existe el usuario con el email [" + usuario.getCorreo() + "]");
		}
		return tmp;
	}// addUsuario

	public Usuario updateUsuario(Long idusuario, String nombre, String correo, ChangePassword changePassword,
			Long telefono, String userType) {
		Usuario tmp = null;
			if (usuarioRepository.existsById(idusuario)) {
				tmp = usuarioRepository.findById(idusuario).get();
				if (nombre != null)
					tmp.setNombre(nombre);
				if (correo != null)
					tmp.setCorreo(correo);
				if (telefono != null)
					tmp.setTelefono(telefono);
				if (userType != null)
					tmp.setUserType(userType);
				
				if (changePassword.getPassword() != null && changePassword.getNewPassword() != null) {
					// if (tmp.getPassword().equals(changePassword.getPassword())) {
					if (passwordEncoder.matches(changePassword.getNewPassword(), tmp.getPassword())) {
						tmp.setPassword(passwordEncoder.encode(changePassword.getNewPassword()));
						usuarioRepository.save(tmp);
					} else {
						tmp = null;
					} // else// if password
				} // if != null
			usuarioRepository.save(tmp);
		} else {
			System.out.println("Update - El procduto con el id [" + idusuario + "] no exixte");
		}
		return tmp;
	}// updateUsuario
	
	public boolean validateUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		Optional<Usuario> userByEmail = usuarioRepository.findByEmail(usuario.getCorreo());
		if (userByEmail.isPresent()) {
			Usuario user = userByEmail.get();
			if (passwordEncoder.matches(usuario.getPassword(), user.getPassword())) {
				return true;
			} // if matches
		} // if isPresent
		return false;
	}
}
