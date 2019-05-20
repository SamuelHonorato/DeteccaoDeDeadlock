package modelos;

import java.util.ArrayList;

public class Recurso {
	private String nome;
	private int id;
	private int quantidade;
	private ArrayList<Processo> ocupado;
	
	public Recurso(String nome, int id, int quantidade) {
		super();
		this.nome = nome;
		this.id = id;
		this.quantidade = quantidade;
		this.ocupado = new ArrayList<Processo>();
	}
	
	public String toString(){
		return id + ". " + nome + ocupado.size() + "/" + quantidade;
	}
	
	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
