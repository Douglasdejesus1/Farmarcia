package com.douglas.farmacia.di.envio;

import org.springframework.stereotype.Component;

import com.douglas.farmacia.di.model.Usuario;

@Component
public class NotificacaoEmail implements Notificacao {



	@Override
	public void envia(Usuario usuario, String mensagem) {

		System.out.printf("Notificando %s atraves do e-mail %s, %s\n", usuario.getNome(),
				usuario.getEmail(), mensagem);

	}

}
