package br.com.alura.escola.dominio.aluno;

public class Email {
	
	private String endereco;

	public Email(String endereco) {
		//throw new IllegalArgumentException("Email inv�vlido");
		
		if(endereco == null || 
		  !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("Email invv�lido");
		}
		this.endereco = endereco;     
	}

	public String getEndereco() {
		return endereco;
	}
}
