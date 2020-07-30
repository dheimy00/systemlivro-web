package br.com.systemlivro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.systemlivro.modelo.Livro;
import br.com.systemlivro.service.LivroService;

@Controller
@RequestMapping("/livros")
public class LivroController {
	
	@Autowired
	private LivroService livroService;

	@GetMapping
	public String index() {
		return "index";
	}

	@GetMapping("/lista")
	public String lista(Model model) {

		List<Livro> livros = livroService.lista();

		model.addAttribute("livros", livros);

		return "/livros/listas-livros";
	}

	@GetMapping("/cadastrar")
	public String cadastroFrom(Model model) {

		Livro livro = new Livro();

		model.addAttribute("livro", livro);

		return "livros/livro-form";
	}

	@PostMapping("/salvar")
	public String salvar(@ModelAttribute("livro") Livro livro) {

		livroService.salvar(livro);

		return "redirect:/livros/lista";

	}

	@GetMapping("/excluir")
	public String excluir(@RequestParam("id") Long id) {

		livroService.excluir(id);
	
		return "redirect:/livros/lista";
	}
	
	@GetMapping("/editar")
	public String atualiza(@RequestParam("id") Long id,Model model) {

		Livro livro =  livroService.get(id);
	
		model.addAttribute("livro", livro);
		
		return "/livros/livro-form";
	}

}
