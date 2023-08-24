package org.generation.elotitos.service;

import java.util.ArrayList;
import java.util.List;

import org.generation.elotitos.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	private final ArrayList<Usuario> listaUsuarios = new ArrayList<>();

	@Autowired
	public UsuarioService() {
		listaUsuarios.add(new Usuario("itzelgps99@gmail.com", "Itzel Guadalupe", "Itzelgps99_", 7551308222L, "admin"));
		listaUsuarios.add(new Usuario("elotestoluca@gmail.com", "Gina Molina", "GinaM99_", 7221953594L, "admin"));
		listaUsuarios.add(new Usuario("mc.michellcazares@gmail.com", "Michell Cázares", "Michell123_", 3121346641L,"xd"));
		listaUsuarios.add(new Usuario("susoto0916@gmail.com", "Susana Soto", "Susana09_", 5543029213L,null));
		listaUsuarios.add(new Usuario("pamela.geofisica@gmail.com", "Brenda Juarez", "Juroju_12", 5522974619L,null));
	}// constructor

	public List<Usuario> getAllUsuarios() {
		// TODO Auto-generated method stub
		return this.listaUsuarios;
	}

	public Usuario getUsuario(Long idusuario) {
		// TODO Auto-generated method stub
		Usuario tmp = null;
		for (Usuario usuario : listaUsuarios) {
			if (usuario.getId().equals(idusuario)) {
				tmp = usuario;
				break;
			} // if
		} // foreach
		return tmp;
	}

	public Usuario deleteUsuario(Long idusuario) {
		// TODO Auto-generated method stub
		Usuario tmp = null;
		for (Usuario usuario : listaUsuarios) {
			if (usuario.getId().equals(idusuario)) {
				tmp = listaUsuarios.remove(listaUsuarios.indexOf(usuario));
				break;
			} // if
		} // foreach
		return tmp;
	}

	public Usuario addUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		if(!usuario.getUserType().equals("admin")) {
			usuario.setUserType("cliente");
		}
		listaUsuarios.add(usuario);
		return usuario;
	}

	public Usuario updateUsuario(Long idusuario, String nombre, String correo, String password, Long telefono,
			String userType) {
		// TODO Auto-generated method stub
		Usuario tmp = null;
		// TODO Auto-generated method stub
		for (Usuario usuario : listaUsuarios) {
			if (usuario.getId().equals(idusuario)) {
				if (nombre != null)
					usuario.setNombre(nombre);
				if (correo != null)
					usuario.setCorreo(correo);
				if (password != null)
					usuario.setPassword(password);
				if (telefono != null)
					usuario.setTelefono(telefono);
				if (userType != null)
					usuario.setUserType(userType);
				tmp = usuario;
				break;
			}
		}
		return tmp;
	}
}
