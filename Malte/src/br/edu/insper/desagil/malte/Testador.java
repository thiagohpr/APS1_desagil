package br.edu.insper.desagil.malte;

public class Testador {
	public boolean testeA() {
		Carrinho carrinhoA=new Carrinho();
		Caixa caixaA=new Caixa();
		float totalA=caixaA.calculaTotal(carrinhoA);
		if (totalA==0) {
			return true;
		}else {
		
	    return false;
	    }
	}

	public boolean testeB() {
		Carrinho carrinhoB=new Carrinho();
		Caixa caixaB=new Caixa();
		Produto produtoB=new Produto(1,10,"Breja do sujus");
		
		carrinhoB.verificaProduto(produtoB);
		
		float totalB=caixaB.calculaTotal(carrinhoB);
		if (totalB==10) {
			return true;
		}else {
		
	    return false;
	    }
	    
	}

	public boolean testeC() {
		Carrinho carrinhoC=new Carrinho();
		Caixa caixaC=new Caixa();
		
		Produto produtoC=new Produto(1,10,"Breja do sujus");
		
		carrinhoC.verificaProduto(produtoC);
		caixaC.adicionaDesconto(produtoC, 50);
		
		float totalC=caixaC.calculaTotal(carrinhoC);		
		if (totalC==5) {
			return true;
		}else {
		
	    return false;
	    }
	}

	public boolean testeD() {
		Carrinho carrinhoD=new Carrinho();
		Caixa caixaD=new Caixa();
		
		Produto produtoD1=new Produto(1,10,"Breja do sujus");
		Produto produtoD2=new Produto(2,2,"Shot do Lobão");
		
		carrinhoD.verificaProduto(produtoD1);
		carrinhoD.verificaProduto(produtoD2);
		carrinhoD.verificaProduto(produtoD2);
		
		caixaD.adicionaDesconto(produtoD1, 50);
		
		float totalD=caixaD.calculaTotal(carrinhoD);
		if (totalD==9) {
			return true;
		}else {
		
	    return false;
	    }
	}

	public boolean testeE() {
		Carrinho carrinhoE=new Carrinho();
		Caixa caixaE=new Caixa();
		
		Produto produtoE1=new Produto(1,10,"Breja do sujus");
		Produto produtoE2=new Produto(2,2,"Shot do Lobão");
		
		carrinhoE.verificaProduto(produtoE1);
		carrinhoE.verificaProduto(produtoE1);
		carrinhoE.verificaProduto(produtoE2);
		
		caixaE.adicionaDesconto(produtoE1, 50);
		
		float totalE=caixaE.calculaTotal(carrinhoE);
		if (totalE==12) {
			return true;
		}else {
		
	    return false;
	    }
	}
}
