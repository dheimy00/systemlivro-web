
package br.com.systemlivro.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.systemlivro.modelo.Usuario;
import br.com.systemlivro.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/usuarios")
	public List<Usuario> lista() {
		return usuarioService.lista();
	}

	@PostMapping("/usuarios")
	public Usuario salvar(@RequestBody Usuario usuario) {
		return usuarioService.salvar(usuario);

	}

	@PutMapping("/usuarios/{id}")
	public String atualiza(@PathVariable("id") Long id, Usuario usuario) {

		return null;
	}

	@GetMapping(value = "/usuarios/{id}")
	public Usuario get(@PathVariable Long id) {
		return usuarioService.get(id);
	}

}
