package org.generation.elotitos.model;

public class ChangePassword {
	private String password;
	private String newPassword;

	public ChangePassword(String password, String newPassword) {
		super();
		this.password = password;
		this.newPassword = newPassword;
	}// constructor

	public ChangePassword() {
	}// constructor por default

	public String getPassword() {
		return password;
	}//

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	@Override
	public String toString() {
		return "ChangePassword [password=" + password + ", newPassword=" + newPassword + "]";
	}

}// class ChangePassword
