package model;

public class UserSistema extends Pessoa {
	private String login;
	private String senha;
	
	public UserSistema(String nomeCompleto,String login,String senha) {
		super(nomeCompleto);
		this.login = login;
		this.senha = senha;
	}

	
	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
}
