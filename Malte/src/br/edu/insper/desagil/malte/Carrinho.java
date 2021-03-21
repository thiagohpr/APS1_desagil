package br.edu.insper.desagil.malte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;

	public Carrinho() {
		this.pedidos = new ArrayList<>();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void verificaProduto (Produto produto) {
		boolean noCarrinho=false;
		for (Pedido pedido:pedidos) {
			Produto produto_lista=pedido.getProduto();
	
			if (produto_lista.getNome()==produto.getNome()) {
				pedido.incrementa();
				noCarrinho=true;
			}
		}
		if (noCarrinho==false) {
			Pedido novo_pedido=new Pedido (produto);
			this.pedidos.add(novo_pedido);
			
		}
		
	}
}
