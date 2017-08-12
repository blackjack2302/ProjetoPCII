package com.mycompany.mavenproject.model;

public class UsuarioSistema extends Pessoa {
	private String login;
	private String senha;
	
	public UsuarioSistema(String nomeCompleto,String login,String senha){
	super(nomeCompleto);
	this.login = login;
	this.senha = senha;
	}
}
