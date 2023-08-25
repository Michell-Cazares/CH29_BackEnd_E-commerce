package org.generation.elotitos.service;

import java.util.List;

import org.generation.elotitos.model.Usuario;
import org.generation.elotitos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}//constructor

	public List<Usuario> getAllUsuarios() {
		return this.usuarioRepository.findAll();
	}//getAllUsuarios


	public Usuario getUsuario(Long idusuario) {
		return usuarioRepository.findById(idusuario)
				.orElseThrow(() -> new IllegalArgumentException("El Usuario con el id" + idusuario + "] no exixte."));
	}//getUsuario

	public Usuario deleteUsuario(Long idusuario) {
		Usuario tmp = null;
		if(usuarioRepository.existsById(idusuario)) {
			tmp = usuarioRepository.findById(idusuario).get();
			usuarioRepository.deleteById(idusuario);
		}
		return tmp;
	}//deleteUsuario

	public Usuario addUsuario(Usuario usuario) {
		Usuario tmp = null;
		tmp = usuarioRepository.save(usuario);
		return tmp;
	}//addUsuario

	public Usuario updateUsuario(Long idusuario, String nombre, String correo, String password, Long telefono,
			String userType) {
		Usuario tmp = null;
		if(usuarioRepository.existsById(idusuario)) {
			tmp = usuarioRepository.findById(idusuario).get();
			if (nombre != null)
				tmp.setNombre(nombre);
			if (correo != null)
				tmp.setCorreo(correo);
			if (password != null)
				tmp.setPassword(password);
			if (telefono != null)
				tmp.setTelefono(telefono);
			if (userType != null)
				tmp.setUserType(userType);
			usuarioRepository.save(tmp);
		}else {
			System.out.println("Update - El procduto con el id [" + idusuario + "] no exixte");
		}
		return tmp;
	}//updateUsuario
}
