package com.douglas.farmacia.di.envio;

import org.springframework.stereotype.Component;

import com.douglas.farmacia.di.model.Usuario;

//@Component
public class NotificacaoEmail implements Notificacao {
	private boolean caixaAlta;
	private String hostServidorSmtp;
	

	public boolean isCaixaAlta() {
		return caixaAlta;
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

	public String getHostServidorSmtp() {
		return hostServidorSmtp;
	}

	public void setHostServidorSmtp(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
	}

	public NotificacaoEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("Construtor chamado");
	}

	@Override
	public void envia(Usuario usuario, String mensagem) {

		if (this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s atraves do e-mail %s: usando SMPT %s , %s\n", usuario.getNome(),
				usuario.getEmail(), this.hostServidorSmtp, mensagem);

	}

}
