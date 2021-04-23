
package br.com.systemlivro.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.systemlivro.modelo.Usuario;
import br.com.systemlivro.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/lista")
	public String lista(Model model) {
		List<Usuario> usuarios = usuarioService.lista();
		model.addAttribute("usuarios", usuarios);
		return "/usuarios/listas-usuarios";
	}

	@GetMapping("/cadastrar")
	public String cadastroFrom(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "usuarios/usuario-form";
	}

	@PostMapping("/salvar")
	public String salvar(@Valid @ModelAttribute("usuario")  Usuario usuario,BindingResult errors,Model modelo) {

		if(errors.hasErrors()) {
			return "usuarios/usuario-form";
		}else {
			usuarioService.salvar(usuario);
		}


		return "redirect:/usuarios/lista";

	}

	@GetMapping("/excluir")
	public String excluir(@RequestParam("id") Long id) {

		usuarioService.excluir(id);
	
		return "redirect:/usuarios/lista";
	}
	
	@GetMapping("/editar")
	public String atualiza(@RequestParam("id") Long id,Model model) {

		Usuario usuario =  usuarioService.get(id);
	
		model.addAttribute("usuario", usuario);
		
		return "/usuarios/usuario-form";
	}
	
	

}
