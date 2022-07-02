package com.douglas.farmacia.di.service;

import org.springframework.stereotype.Component;

import com.douglas.farmacia.di.envio.Notificacao;
import com.douglas.farmacia.di.model.Usuario;
@Component
public class AtivarUsuarioService {
	
	Notificacao notificacao;
	
	
	
	public AtivarUsuarioService(Notificacao notificacao) {
		super();
		this.notificacao = notificacao;
	}
	



	public Notificacao getNotificacao() {
		return notificacao;
	}




	public void ativar(Usuario usuario) {
		
		usuario.ativar();
		notificacao.envia(usuario, "Conta ativa");
		
		
		
	}

}
