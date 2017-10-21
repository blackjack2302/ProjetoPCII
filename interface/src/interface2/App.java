package interface2;

import java.util.List;

import javax.swing.JFrame;


import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.UserSistema;
import model.UsuarioDoSistema;
import persistencia.Conexao;
import persistencia.UsuarioDoSistemaDAO;
import view.LoginPanel;

public class App 
{
	private static String versao = "v1.0";
	private List<UserSistema> userCadastrados = new ArrayList<UserSistema>();
	private List<UserSistema> userLogados = new ArrayList<UserSistema>();
	private UserSistema usuarioLogado;
	
	public App(){
		this.userCadastrados.add(new UserSistema("Administrador","admin","123456"));
		this.showPanelLogin();
	}
	
	public void showPanelLogin(){
		JFrame jFrame = new JFrame("Interface Principal");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(400, 400);
		LoginPanel loginPanel = new LoginPanel(this);
		jFrame.getContentPane().add(loginPanel, null);
		jFrame.pack();
		jFrame.setVisible(true);		
	}
	
	public List<UserSistema> getUsuariosCadastrados(){
		return userCadastrados;
	}
	
	public UserSistema getUsuarioLogado() {
		return usuarioLogado;
	}	
	
	public void setUserLogado(UserSistema userLogado){
		this.userLogados = userLogados;
	}
	public List<UserSistema> getUsuariosLogados() {
		return userLogados;
	}

	public void setUsuariosLogados(List<UserSistema> usuariosLogados) {
		this.userLogados = userLogados;
	}
	
	public static void main(String[] args) throws Exception{
		new App();
//		Connection conn = new Conexao().getMysqlConnection();
//		
//		String sql = "insert into alunos(nmAluno) values ('alunos12')";
//		PreparedStatement stm = conn.prepareStatement(sql);
//		stm.executeUpdate();
//		
//		ResultSet rs = stm.executeQuery("Select * from alunos");
//		while(rs.next()){
//			System.out.println(rs.getString("nmAluno"));
//		}
		
		UsuarioDoSistema usuarioDoSistema1 = new UsuarioDoSistema();
		usuarioDoSistema1.setLogin("Roberto");
		usuarioDoSistema1.setSenha("123");
		
		UsuarioDoSistema usuarioDoSistema2 = new UsuarioDoSistema();
		usuarioDoSistema2.setLogin("Leonardo");
		usuarioDoSistema2.setSenha("123");
		
		UsuarioDoSistema usuarioDoSistema3 = new UsuarioDoSistema();
		usuarioDoSistema3.setLogin("Isabela");
		usuarioDoSistema3.setSenha("123");
		
		UsuarioDoSistema usuarioDoSistema4 = new UsuarioDoSistema();
		usuarioDoSistema4.setLogin("Fernanda");
		usuarioDoSistema4.setSenha("123");
		
		UsuarioDoSistema usuarioDoSistema5 = new UsuarioDoSistema();
		usuarioDoSistema5.setLogin("Jessica");
		usuarioDoSistema5.setSenha("123");
		
		UsuarioDoSistema usuarioDoSistema6 = new UsuarioDoSistema();
		usuarioDoSistema6.setLogin("Jennifer");
		usuarioDoSistema6.setSenha("123");
		
		Connection mysqlConnection = new Conexao().getMysqlConnection();
		UsuarioDoSistemaDAO<UsuarioDoSistema> usuarioDoSistemaDAO = new UsuarioDoSistemaDAO<>(mysqlConnection);
		usuarioDoSistemaDAO.inserir(usuarioDoSistema1);
		usuarioDoSistemaDAO.inserir(usuarioDoSistema2);
		usuarioDoSistemaDAO.inserir(usuarioDoSistema3);
		usuarioDoSistemaDAO.inserir(usuarioDoSistema4);
		usuarioDoSistemaDAO.inserir(usuarioDoSistema5);
		usuarioDoSistemaDAO.inserir(usuarioDoSistema6);
		
		
		
		
		
	}
}
