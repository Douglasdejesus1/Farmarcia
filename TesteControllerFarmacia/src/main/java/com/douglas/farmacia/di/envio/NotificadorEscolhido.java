package com.douglas.farmacia.di.envio;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface NotificadorEscolhido {
	NotificadorPrioridade value();
}
