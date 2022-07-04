package com.douglas.farmacia.di.envio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.douglas.farmacia.di.model.Usuario;
@Profile("dev")
@NotificadorEscolhido(NotificadorPrioridade.ALTA)
@Component
public class NotificacaoEmailMOCK implements Notificacao {
	
	NotificacaoEmailMOCK(){
		System.out.println("MOCK");
	}


	@Override
	public void envia(Usuario usuario, String mensagem) {

		System.out.printf("MOCK: ESSE EMAIL SERIA ENVIDADO PARA: %s atraves do e-mail %s, %s\n", usuario.getNome(),
				usuario.getEmail(), mensagem);

	}

}
