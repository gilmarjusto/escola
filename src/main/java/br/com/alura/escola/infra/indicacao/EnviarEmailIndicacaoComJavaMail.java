package br.com.alura.escola.infra.indicacao;

import br.com.alura.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.alura.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao{

	@Override
	public void enviarEmailPara(Aluno indicado) {
		//logica de envio de email com a lib Java Mail
		System.out.println("Email fake Enviado com sucesso!!!");
	}
}
