package br.com.systemlivro.service;

import java.util.List;

import br.com.systemlivro.modelo.Usuario;

public interface UsuarioService {
	
	List<Usuario> lista();

	Usuario salvar(Usuario usuario);

	Usuario get(Long id);

	void excluir(Long id);

}
