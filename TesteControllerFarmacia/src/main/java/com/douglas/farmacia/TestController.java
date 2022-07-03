package com.douglas.farmacia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douglas.farmacia.di.model.Usuario;
import com.douglas.farmacia.di.service.AtivarUsuarioService;

@Controller
public class TestController {
private AtivarUsuarioService ativacaoUsuarioService;
	
	public TestController(AtivarUsuarioService ativacaoUsuarioService) {
		this.ativacaoUsuarioService = ativacaoUsuarioService;
	}
	
	@GetMapping("/caminho")
	@ResponseBody
	public String caminho() {
		
		Usuario usuario = new Usuario("Douglas", "douglas@email.com", "1195486");
		ativacaoUsuarioService.ativar(usuario);
			
		return "Qualifier funcionando";
	}

}
