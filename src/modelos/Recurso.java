package modelos;

public class Recurso {
	private String nome;
	private int id;
	private int quantidade;
	
	public Recurso(String nome, int id, int quantidade) {
		super();
		this.nome = nome;
		this.id = id;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
