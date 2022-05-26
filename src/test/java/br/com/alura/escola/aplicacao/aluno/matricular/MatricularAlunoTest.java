package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void AlunoDeveriaSerPersistidoEmMemoria() {
		
		RepositorioDeAlunosEmMemoria emMemoria = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(emMemoria);
		
		MatricularAlunoDto dadosDoAlunoDto = new MatricularAlunoDto("Gilmar", "220.617.538-09", "gilmar.justo2@gmail.com");
		useCase.executar(dadosDoAlunoDto);
		
		Aluno AlunoEncontrado = emMemoria.buscaAlunoPorCPF(new CPF("220.617.538-09"));
		
		//System.out.println("Aluno: " + AlunoEncontrado.getNome());
		assertEquals("Gilmar", AlunoEncontrado.getNome());
		assertEquals("220.617.538-09", AlunoEncontrado.getCpf());
		assertEquals("gilmar.justo2@gmail.com", AlunoEncontrado.getEmail());
	}

}
