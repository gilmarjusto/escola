package br.com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

	List<Aluno> matriculados = new ArrayList<>();
	
	@Override
	public void matricular(Aluno aluno) {
		matriculados.add(aluno);
	}

	@Override
	public Aluno buscaAlunoPorCPF(CPF cpf) {
		return this.matriculados.stream()
		.filter(a -> a.getCpf().equals(cpf.getNumero()))
		.findFirst()
		.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> ListaTodosAlunosMatriculados() {
		return matriculados;
	}

}
