package br.edu.insper.desagil.malte;

public class Produto {
	private int codigo;
	private double preco;
	private String nome;
	
	public Produto (int codigo, double preco, String nome) {
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
		
	}
	public int getCodigo() {
	return this.codigo;
	
	}
	public double getPreco() {
		return this.preco;	
	}
	public String getNome() {
		return this.nome;
		
	}

}


	


