package com.douglas.farmacia.di.envio;

import org.springframework.stereotype.Component;

import com.douglas.farmacia.di.model.Usuario;

@Component
public interface Notificacao {
	
	public void envia(Usuario usuario, String mensagem);

}
