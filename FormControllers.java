package com.elba.demoform.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormControllers {

	@GetMapping("/form")
	public String form(Model model) {
		
		model.addAttribute("titulo", "Introducir datos ");
		
		return "form";

	}

	// capturar los parametros del formulario
	@PostMapping("/form")
	public String procesar(Model model, @RequestParam String username, @RequestParam String password,
			@RequestParam String email) {
		
		model.addAttribute("titulo", "Resultaooo");
		model.addAttribute("username", username);// con el cual se pasa a lavista
		model.addAttribute("password", password);
		model.addAttribute("email", email);
		
		return "resultado";
	}

}
