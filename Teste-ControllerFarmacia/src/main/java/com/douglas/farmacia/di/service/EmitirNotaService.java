package com.douglas.farmacia.di.service;

import org.springframework.stereotype.Component;

import com.douglas.farmacia.di.envio.Notificacao;
import com.douglas.farmacia.di.model.Remedio;
import com.douglas.farmacia.di.model.Usuario;
@Component
public class EmitirNotaService {
	
	Notificacao notificacao;

	public EmitirNotaService(Notificacao notificacao) {
		super();
		this.notificacao = notificacao;
	}

	public Notificacao getNotificacao() {
		return notificacao;
	}
	
	public void Emitir(Usuario usuario,Remedio remedio) {
		
		notificacao.envia(usuario, "nota fical do medicamento"+remedio.getPrincipioAtivo()
		+", fabricante: "+remedio.getFabricante()+", Preço total R$"+remedio.getTotal());
	}
	

}