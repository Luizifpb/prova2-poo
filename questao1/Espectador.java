package br.edu.ifpb.poo;




public abstract class Espectador
{
	
	
	private String nome;
	
	
	
	private int idade;
	
	
	
	private Tarifa tipo_de_tarifa;
	
	
	
	private double preco_ingresso;
	

	public Espectador(){
		super();
	}


	public double getPreco_ingresso() {
		return preco_ingresso;
	}


	public void setTipo_de_tarifa(Tarifa tipo_de_tarifa) {
		this.tipo_de_tarifa = tipo_de_tarifa;
		this.preco_ingresso = tipo_de_tarifa.preço();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}

