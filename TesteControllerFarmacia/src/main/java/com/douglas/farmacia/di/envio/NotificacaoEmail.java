package com.douglas.farmacia.di.envio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.douglas.farmacia.di.model.Usuario;
@Qualifier("baixaPrioridade")
@Component
public class NotificacaoEmail implements Notificacao {



	@Override
	public void envia(Usuario usuario, String mensagem) {

		System.out.printf("Notificando %s atraves do e-mail %s, %s\n", usuario.getNome(),
				usuario.getEmail(), mensagem);

	}

}
