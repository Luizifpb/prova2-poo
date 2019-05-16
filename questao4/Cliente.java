package br.edu.ifpb.poo;


import java.util.Objects;

public class Cliente
{
	
	
	private String código;
	
	
	
	private String nome;
	
	
	
	private String sobrenome;
	
	
	
	private String idade;
	
	
	
	private String endereço;
	
	
	
	private String cidade;
	
	
	
	private String estado;
	
	
	
	private String código_postal;


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cliente cliente = (Cliente) o;
		return código.equals(cliente.código);
	}

	@Override
	public int hashCode() {
		return Objects.hash(código);
	}

	public String getCódigo() {
		return código;
	}

	public void setCódigo(String código) {
		this.código = código;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCódigo_postal() {
		return código_postal;
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"código='" + código + '\'' +
				", nome='" + nome + '\'' +
				", sobrenome='" + sobrenome + '\'' +
				", idade='" + idade + '\'' +
				", endereço='" + endereço + '\'' +
				", cidade='" + cidade + '\'' +
				", estado='" + estado + '\'' +
				", código_postal='" + código_postal + '\'' +
				'}';
	}

	public void setCódigo_postal(String código_postal) {
		this.código_postal = código_postal;
	}
}

