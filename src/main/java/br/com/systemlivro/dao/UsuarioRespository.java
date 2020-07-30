package br.com.systemlivro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.systemlivro.modelo.Usuario;

@Repository
public interface UsuarioRespository extends JpaRepository<Usuario, Long> {

}
