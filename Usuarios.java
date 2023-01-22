package com.elba.demoform.app.models.domain;

public class Usuarios {

	private String Usename;
	private String password;
	private String email;

	public String getUsename() {
		return Usename;
	}

	public void setUsename(String usename) {
		Usename = usename;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
