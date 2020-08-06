package br.com.systemlivro.controller;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.systemlivro.modelo.Livro;
import br.com.systemlivro.modelo.Pedido;
import br.com.systemlivro.modelo.Usuario;
import br.com.systemlivro.service.LivroService;
import br.com.systemlivro.service.PedidoService;
import br.com.systemlivro.service.UsuarioService;

@Controller
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired 
	private LivroService livroService;
	
	@Autowired
	private PedidoService pedidoService;
	
	public static final Logger logger = LoggerFactory.getLogger(PedidoController.class);
	
	@GetMapping("/novo-pedido")
	public String index(Model model) {
		
		Pedido pedido = new  Pedido();
   
		model.addAttribute("pedido",pedido);
		model.addAttribute("usuarios",usuarioService.lista() );
		model.addAttribute("livros",livroService.lista());
		
		return "pedido/pedido-form";
	} 
	
	
	@PostMapping("/salvar")
	public String salvar(@ModelAttribute("pedido")  Pedido pedido,@RequestParam Long id,@RequestParam(value = "livros") Long [] livros) {
	
		logger.info("{} {} {}",pedido,id);

		Pedido p = new Pedido();
		Usuario us = new Usuario();
		us.setId(id);
		p.setUsuario(usuarioService.get(us.getId()));
		Set<Livro> livrosSet = new HashSet<Livro>();
		for(Long livroId: livros) {
			livrosSet.add(livroService.get(livroId));
		}
		p.setLivros(livrosSet);
		p.setQuantidade(pedido.getQuantidade());
		pedidoService.salvar(p);
		return "redirect:/pedido/consultar";
		
	}
	
	@GetMapping("/consultar")
	public String consultar(Model model) {
		
		model.addAttribute("pedidos",pedidoService.lista());
		
		return "pedido/lista-pedido";
	}
	

}
