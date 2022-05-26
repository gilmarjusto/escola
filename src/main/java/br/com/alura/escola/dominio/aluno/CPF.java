package br.com.alura.escola.dominio.aluno;

public class CPF {
	
	private String numero;

	public CPF(String cpf) {
		if(cpf == null || !cpf.matches("^[0-9]{3}.?[0-9]{3}.?[0-9]{3}-?[0-9]{2}$")) {
			throw new IllegalArgumentException("CPF inválido!");
		}
		this.numero = cpf;
	}

	public String getNumero() {
		return numero;
	}
}
