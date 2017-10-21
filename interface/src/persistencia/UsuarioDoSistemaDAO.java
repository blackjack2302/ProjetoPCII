package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Pessoa;
import model.UsuarioDoSistema;


public class UsuarioDoSistemaDAO<T extends UsuarioDoSistema> implements IDAO<T>{

	
	private Connection conn;

	public UsuarioDoSistemaDAO(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void inserir(T t) throws Exception {
		PreparedStatement prepareStatement = 
				this.conn.prepareStatement("insert into UsuarioDoSistema (login,senha) values ('"
				+ ((UsuarioDoSistema)t).getLogin() + "','" 
						+ ((UsuarioDoSistema)t).getSenha()+"');");
				prepareStatement.execute();		
	}

	@Override
	public List<T> listar() throws SQLException {

		PreparedStatement prepareStatement = conn.prepareStatement("select * from UsuarioDoSistema");
		ResultSet rs = prepareStatement.executeQuery();
		List<UsuarioDoSistema> listaDeUsuariosCadastradosNoBanco = new ArrayList<>();
		
		while(rs.next()){
			String login = rs.getString("login");
			String senha =  rs.getString("senha");
			
			UsuarioDoSistema usuarioDoSistema = new UsuarioDoSistema();
			usuarioDoSistema.setLogin(login);
			usuarioDoSistema.setSenha(senha);
			listaDeUsuariosCadastradosNoBanco.add(usuarioDoSistema);
		}
			
		return (List<T>) listaDeUsuariosCadastradosNoBanco;
	}

	
	
}
