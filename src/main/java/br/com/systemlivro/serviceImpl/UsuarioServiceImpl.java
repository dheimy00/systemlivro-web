package br.com.systemlivro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.systemlivro.dao.UsuarioRespository;
import br.com.systemlivro.modelo.Usuario;
import br.com.systemlivro.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioRespository usuarioRespository;
	
	@Autowired
	public UsuarioServiceImpl(UsuarioRespository usuarioRespository) {
		this.usuarioRespository = usuarioRespository;
	}

	@Override
	public List<Usuario> lista() {

		return usuarioRespository.findAll();
	}

	@Override
	public Usuario salvar(Usuario usuario) {
		
		return usuarioRespository.save(usuario);
	}

	@Override
	public Usuario get(Long id) {
		return usuarioRespository.findById(id).get();
	}

	@Override
	public void excluir(Long id) {

		usuarioRespository.deleteById(id);
	}


}
