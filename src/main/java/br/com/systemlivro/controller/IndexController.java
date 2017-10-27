package br.com.systemlivro.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.systemlivro.modelo.Livro;
import br.com.systemlivro.service.LivroService;

@Controller
public class IndexController {

	@Autowired
	private LivroService livroService;

	@GetMapping("/")
	public String home(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("/todos-livros")
	public String listarLivros(HttpServletRequest request){
		request.setAttribute("livros", livroService.listarLivro());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}

	@GetMapping("/novo-livro")
	public String newTask(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}

	@PostMapping("/salvar-livro")
	public String salvarLivro(@ModelAttribute Livro livro, BindingResult bindingResult, HttpServletRequest request) {
		livro.setCriarData(new Date());
		livroService.salvarLivro(livro);
		request.setAttribute("livros", livroService.listarLivro());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}

	@GetMapping("/atualizar-livro")
	public String alterarLivro(@RequestParam int id, HttpServletRequest request) {
		request.setAttribute("livro", livroService.obter(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}

	@GetMapping("/excluir-livro")
	public String excluirLivro(@RequestParam int id, HttpServletRequest request) {
		livroService.excluirLivro(id);
		request.setAttribute("livros", livroService.listarLivro());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}

	public LivroService getLivroService() {
		return livroService;
	}

	public void setLivroService(LivroService livroService) {
		this.livroService = livroService;
	}

}
