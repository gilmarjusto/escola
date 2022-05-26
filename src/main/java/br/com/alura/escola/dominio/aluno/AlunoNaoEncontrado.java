package br.com.alura.escola.dominio.aluno;

public class AlunoNaoEncontrado extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public AlunoNaoEncontrado(CPF cpf) {
		super("Aluno de cpf " + cpf.getNumero() + " não encontrado");
	}
}
