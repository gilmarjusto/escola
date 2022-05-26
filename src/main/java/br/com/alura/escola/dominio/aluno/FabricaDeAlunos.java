package br.com.alura.escola.dominio.aluno;

public class FabricaDeAlunos {
	
	private Aluno aluno;
	
	public FabricaDeAlunos comNomeCPFEmail(String nome, String cpf, String Email) {
		this.aluno = new Aluno(new CPF(cpf),
								nome,
								new Email(Email));
		return this;
	}
	
	
	public FabricaDeAlunos comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
}
