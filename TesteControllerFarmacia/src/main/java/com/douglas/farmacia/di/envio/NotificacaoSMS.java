package com.douglas.farmacia.di.envio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.douglas.farmacia.di.model.Usuario;
@Qualifier("altoPrioridade")
@Component
public class NotificacaoSMS implements Notificacao {

	@Override
	public void envia(Usuario usuario, String mensagem) {
		System.out.printf("Sr(a) %s TELEFONE: %s ,%s \n", usuario.getNome(), usuario.getTelefone(), mensagem);

	}

}
