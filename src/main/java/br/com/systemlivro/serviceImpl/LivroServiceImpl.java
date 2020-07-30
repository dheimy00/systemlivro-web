package br.com.systemlivro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.systemlivro.dao.LivroRepository;
import br.com.systemlivro.modelo.Livro;
import br.com.systemlivro.service.LivroService;

@Service
public class LivroServiceImpl implements LivroService {
	
	@Autowired
	private LivroRepository livroRepository;

	@Override
	public List<Livro> lista() {

		return livroRepository.findAll();
	}

	@Override
	public Livro salvar(Livro livro) {

		return livroRepository.save(livro);
	}

	@Override
	public Livro get(Long id) {

		return livroRepository.findById(id).get();
	}

	@Override
	public void excluir(Long id) {
		
		livroRepository.deleteById(id);
	}

}
