package br.com.systemlivro.service;

import java.util.List;

import br.com.systemlivro.modelo.Livro;

public interface LivroService{
	
	List<Livro> lista();
	
	Livro salvar(Livro livro);
	
	Livro get(Long id);
		
	void excluir(Long id);

	 	 	
}
