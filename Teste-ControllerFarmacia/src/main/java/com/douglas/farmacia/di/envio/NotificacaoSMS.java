package com.douglas.farmacia.di.envio;

import com.douglas.farmacia.di.model.Usuario;
//@Component
public class NotificacaoSMS implements Notificacao{

	@Override
	public void envia(Usuario usuario, String mensagem) {
		System.out.printf("Sr(a) %s TELEFONE: % ,%s \n",usuario.getNome(),usuario.getTelefone(),mensagem);
		
	}

}
