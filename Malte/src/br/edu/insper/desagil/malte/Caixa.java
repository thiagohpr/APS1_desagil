package br.edu.insper.desagil.malte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	
	private Map<Integer, Integer> descontos;
	
	public Caixa() {
		this.descontos = new HashMap<>();
	}

	public void adicionaDesconto (Produto produto, int desconto) {
		if (desconto>=1 && desconto<=99) {
			int cod = produto.getCodigo();
			this.descontos.put(cod, desconto);
		}
	}
	
	public float calculaTotal (Carrinho carrinho) {
		float total = 0;
		
		for (Pedido pedido:carrinho.getPedidos()) {
			Produto produto=pedido.getProduto();
			int cod = produto.getCodigo();
			if (this.descontos.containsKey(cod)) {
				int desconto=this.descontos.get(cod);
				total+=pedido.total()*((double)(100-desconto)/100);
			}else {
				total+=pedido.total();
			}
			
			
		}
		
		return total;
	}
	
}
