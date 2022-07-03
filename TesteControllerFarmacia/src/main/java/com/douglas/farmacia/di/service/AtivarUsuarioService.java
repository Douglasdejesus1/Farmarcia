package com.douglas.farmacia.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.douglas.farmacia.di.envio.Notificacao;
import com.douglas.farmacia.di.model.Usuario;

@Component
public class AtivarUsuarioService {

	@Autowired
	List<Notificacao> notificacoes;

	public void ativar(Usuario usuario) {

		usuario.ativar();
		for (Notificacao notificacao : notificacoes) {
			notificacao.envia(usuario, "Conta ativa");
		}

	}
}
