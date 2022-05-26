package br.com.alura.escola.infra.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.dominio.aluno.Telefone;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

	private final Connection connection;
	
	public RepositorioDeAlunosComJDBC(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void matricular(Aluno aluno) {
		
		try {
			String sql = "INSERT INTO ALUNO VALUES(?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);			
			ps.setString(1, aluno.getCpf());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.execute();
			
			for (Telefone telefone : aluno.getTelefones()) {
				sql = "INSERT INTO TELEFONE VALUE(?, ?)";
				ps.setString(1, telefone.getDdd());
				ps.setString(2, telefone.getNumero());
				ps.execute();
			}
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public Aluno buscaAlunoPorCPF(CPF cpf) {
		return null;
	}

	@Override
	public List<Aluno> ListaTodosAlunosMatriculados() {
		return null;
	}

}
