package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Pessoa;
import persistencia.IDAO;

public class AlunoDAO implements IDAO{
		
		Connection conn;
		
		public AlunoDAO(Connection conn) {
			this.conn = conn;
		}

		@Override
		public void inserir(Object o) throws SQLException {
			String sql = "insert into alunos (nmAluno) values ('"+o.getClass()+"')";
			System.out.println(sql);
			PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
			prepareStatement.execute();
		}

		@Override
		public List listar() throws SQLException {
			
			
			return null;
		}
		
	
}
