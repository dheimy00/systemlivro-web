package br.com.systemlivro.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.systemlivro.modelo.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro,Long>{
	
	


}
