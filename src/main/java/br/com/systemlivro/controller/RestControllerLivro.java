package br.com.systemlivro.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.systemlivro.modelo.Livro;
import br.com.systemlivro.service.LivroService;

@RestController
public class RestControllerLivro {
	
	@Autowired
	private LivroService livroService;
		
	@GetMapping("/listar")
	public String allTasks(){
		return livroService.listarLivro().toString();
	}
	
	public LivroService getLivroService() {
		return livroService;
	}
	
	public void setLivroService(LivroService livroService) {
		this.livroService = livroService;
	}
	
	
	
	
	

	
}
