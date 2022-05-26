package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Gilmar Justo";
		String cpf = "123.456.789-00";
		String email = "gilmar.justo2xgmail.com";
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
		matricular.executar(new MatricularAlunoDto(nome, cpf, email));
	}
}
