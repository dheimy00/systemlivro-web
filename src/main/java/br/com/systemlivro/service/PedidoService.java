package br.com.systemlivro.service;

import java.util.List;

import br.com.systemlivro.modelo.Pedido;

public interface PedidoService {
	
	List<Pedido> lista();
	
	Pedido salvar(Pedido pedido);
	
	Pedido get(Long id);
		
	void excluir(Long id);


}
