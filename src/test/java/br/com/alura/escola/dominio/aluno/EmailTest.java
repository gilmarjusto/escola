package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(null));

		assertThrows(IllegalArgumentException.class, 
				() -> new Email(""));

		assertThrows(IllegalArgumentException.class, 
				() -> new Email("emailInvalidos"));		
	}
	
	@Test
	void deveriaPassarNoTesteComEnderecoDeEmailValido() {
		String emailTest = "gilmar.justo2@gmail.com";
		//assertArrayEquals(null, 
			//	() -> new Email(emailTest));
		assertDoesNotThrow(() -> new Email(emailTest));
	}
	

}
