package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Telefone;

class TelefoneTest {

	@Test
	void naoDeveriaCriarTelefoneComNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("01", "11111111"));

		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("01", "98611-7878"));		

		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone(" ", "111 11111"));		

		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("11", "1111+1111"));	
	}
	
	@Test
	void deveriaCriarTelefoneComNumerosValidos() {
		assertDoesNotThrow(() -> new Telefone("11", "98611-7878"));
		assertDoesNotThrow(() -> new Telefone("11", "98611 7878"));
		assertDoesNotThrow(() -> new Telefone("11", "8611-7878"));
		assertDoesNotThrow(() -> new Telefone("11", "8611 7878"));
	}

	
}
