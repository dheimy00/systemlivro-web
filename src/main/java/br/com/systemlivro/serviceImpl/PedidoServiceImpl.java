package br.com.systemlivro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.systemlivro.dao.PedidoRepository;
import br.com.systemlivro.modelo.Pedido;
import br.com.systemlivro.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService{
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public List<Pedido> lista() {
		// TODO Auto-generated method stub
		return pedidoRepository.findAll();
	}

	@Override
	public Pedido salvar(Pedido pedido) {
		// TODO Auto-generated method stub
		return pedidoRepository.save(pedido);
	}

	@Override
	public Pedido get(Long id) {
		// TODO Auto-generated method stub
		return pedidoRepository.findById(id).get();
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		pedidoRepository.deleteById(id);
	}

}
