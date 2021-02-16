package br.com.desk.formCadastro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	
	@GetMapping("/cadastroForm")
	public String cadastroForm() {
		return "cadastroForm";
		
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "loginForm";
		
	}

}
