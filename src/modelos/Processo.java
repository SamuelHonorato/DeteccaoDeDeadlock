package modelos;

public class Processo implements Runnable{
	private int id;
	
	//tempo em segundos
	private int tempoSolicitacao;
	private int tempoUtilizacao;
	
	public Processo(int id, int tempoSolicitacao, int tempoUtilizacao) {
		this.id = id;
		this.tempoSolicitacao = tempoSolicitacao;
		this.tempoUtilizacao = tempoUtilizacao;
	}
	
	@Override
	public void run() {
		//thread
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTempoSolicitacao() {
		return tempoSolicitacao;
	}

	public void setTempoSolicitacao(int tempoSolicitacao) {
		this.tempoSolicitacao = tempoSolicitacao;
	}

	public int getTempoUtilizacao() {
		return tempoUtilizacao;
	}

	public void setTempoUtilizacao(int tempoUtilizacao) {
		this.tempoUtilizacao = tempoUtilizacao;
	}
	
	public void solicitaRecurso() {
		//utiliza e libera recurso ou vai dormir
	}
	
	public void executa() {
		
	}
	
	public void elimina() {
		
	}
}
