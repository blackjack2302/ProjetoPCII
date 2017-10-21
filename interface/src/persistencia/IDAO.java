package persistencia;

import java.sql.SQLException;
import java.util.List;

import model.Pessoa;

public interface IDAO<T> {
	void inserir(T t) throws Exception;

	List<T> listar() throws SQLException;
}
