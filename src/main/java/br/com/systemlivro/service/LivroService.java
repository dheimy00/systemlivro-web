package br.com.systemlivro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import br.com.systemlivro.dao.LivroRepository;
import br.com.systemlivro.modelo.Livro;

@Service
@Transactional
public class LivroService{


	private final LivroRepository livroRepository;
	
	public LivroService(LivroRepository livroRepository) {
		super();
		this.livroRepository = livroRepository;
	}
	
	public void salvarLivro(Livro livro){
		livroRepository.save(livro); 
	 }
	 
	 public void excluirLivro(int id){
		 livroRepository.delete(id);
	 }
	 
     public List<Livro> listarLivro(){
    	 List<Livro> livros = new ArrayList<>();
    	 for(Livro livro : livroRepository.findAll()){
    	 livros.add(livro);
    	 }
    	 return livros;
     }
	 
	 public Livro obter(int id){
		 return livroRepository.findOne(id);
	 }


	 	 	
}
