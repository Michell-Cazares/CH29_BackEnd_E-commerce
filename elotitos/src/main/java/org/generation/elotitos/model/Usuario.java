package org.generation.elotitos.model;

public class Usuario {
	private Long idusuario;
	private String correo;
	private String nombre;
	private String password;
	private Long telefono;
	private String userType;
	private static long total = 0;

	public Usuario(String correo, String nombre, String password, Long telefono, String userType) {
		super();
		this.correo = correo;
		this.nombre = nombre;
		this.password = password;
		this.telefono = telefono;
		if (userType != "admin") {
			this.userType = "cliente";
		} else {
			this.userType = userType;
		}
		Usuario.total++;
		this.idusuario = Usuario.total;
	}

	public Usuario() {
		Usuario.total++;
		this.idusuario = Usuario.total;
	}// constructor

	public String getCorreo() {
		return correo;
	}// getCorreo

	public void setCorreo(String correo) {
		this.correo = correo;
	}// setCorreo

	public String getNombre() {
		return nombre;
	}// getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}// setNombre

	public String getPassword() {
		return password;
	}// getPassword

	public void setPassword(String password) {
		this.password = password;
	}// setPassword

	public Long getTelefono() {
		return telefono;
	}// getTelefono

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}// setTelefono

	public String getUserType() {
		return userType;
	}// getUserType

	public void setUserType(String userType) {
		this.userType = userType;
	}// setUserType

	public Long getId() {
		return idusuario;
	}// getId

	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", correo=" + correo + ", nombre=" + nombre + ", password=" + password
				+ ", telefono=" + telefono + ", userType=" + userType + "]";
	}

}
