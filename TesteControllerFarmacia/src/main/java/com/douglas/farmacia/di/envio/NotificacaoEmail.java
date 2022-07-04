package com.douglas.farmacia.di.envio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.douglas.farmacia.di.model.Usuario;
@Profile("prod")
@NotificadorEscolhido(NotificadorPrioridade.ALTA)
@Component
public class NotificacaoEmail implements Notificacao {
	
	NotificacaoEmail(){
		System.out.println("PrioridadeBaixa");
	}


	@Override
	public void envia(Usuario usuario, String mensagem) {

		System.out.printf("Notificando %s atraves do e-mail %s, %s\n", usuario.getNome(),
				usuario.getEmail(), mensagem);

	}

}
