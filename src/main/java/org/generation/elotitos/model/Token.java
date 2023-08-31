package org.generation.elotitos.model;

public class Token {
	private final String accessToken;
	private Long idusuario;

	public Token(String accessToken,Long idusuario) {
		super();
		this.accessToken = accessToken;
		this.idusuario = idusuario;
	}//constructor

	public String getAccessToken() {
		return accessToken;
	}//getAccessToken

	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}//setIdusuario
	
	
	
}// class Token
