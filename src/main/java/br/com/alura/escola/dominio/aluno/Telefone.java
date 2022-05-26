package br.com.alura.escola.dominio.aluno;

public class Telefone {
	
	private String ddd;
	private String numero;
	
	public Telefone(String ddd, String numero) {
		if(ddd == null ||
		  !ddd.matches("^[1-9]{1}[0-9]{1}$")) {
			throw new IllegalArgumentException("DDD inválido!!!");
		}
		if(numero == null ||
		  !(numero.matches("^[0-9]{4}[- ]?[0-9]{4}$") ||
		    numero.matches("^[0-9]{5}[- ]?[0-9]{4}$"))) {
			throw new IllegalArgumentException("Telefone inválido!!!");
		}
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}
	
}
