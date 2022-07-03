package com.douglas.farmacia.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.douglas.farmacia.di.envio.Notificacao;
import com.douglas.farmacia.di.model.Remedio;
import com.douglas.farmacia.di.model.Usuario;

//@Component
public class EmitirNotaService {
//	@Autowired
	List<Notificacao> notificacoes;

	public void Emitir(Usuario usuario, Remedio remedio) {

		for (Notificacao notificacao : notificacoes) {
			notificacao.envia(usuario, "nota fical do medicamento" + remedio.getPrincipioAtivo() + ", fabricante: "
					+ remedio.getFabricante() + ", Preço total R$" + remedio.getTotal());
		}
	}

}
