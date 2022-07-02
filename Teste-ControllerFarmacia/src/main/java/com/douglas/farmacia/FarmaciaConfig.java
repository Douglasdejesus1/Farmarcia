package com.douglas.farmacia;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douglas.farmacia.di.envio.NotificacaoEmail;
import com.douglas.farmacia.di.service.AtivarUsuarioService;

@Configuration
public class FarmaciaConfig {

	@Bean
	public NotificacaoEmail notificacaoEmail() {
		NotificacaoEmail notificador = new NotificacaoEmail("smtp.algamail.com.br");
		//notificador.setCaixaAlta(true);
		return notificador;
	}
	@Bean
	public AtivarUsuarioService ativacaoUsuarioService() {
		return new AtivarUsuarioService(notificacaoEmail());
	}

}
