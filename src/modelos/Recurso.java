package modelos;

public class Recurso {
	private String nome;
	private int id;
	private int quantidade;
	private int ocupado;
	
	public Recurso(String nome, int id, int quantidade) {
		super();
		this.nome = nome;
		this.id = id;
		this.quantidade = quantidade;
		this.ocupado = 0;
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
