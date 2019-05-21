package modelos;

import java.util.ArrayList;

public class Processo extends Thread{
	private String id;
	//tempo em segundos
	private int tempoSolicitacao;
	private int tempoUtilizacao;
	private String[] recursos;
	private Boolean rodando;
	
	public Processo(String id, int tempoSolicitacao, int tempoUtilizacao) {
		this.id = id;
		this.tempoSolicitacao = tempoSolicitacao;
		this.tempoUtilizacao = tempoUtilizacao;
	}
	
	@Override
	public void run() {
		//thread
		while(true){
			System.out.println(id);
			for(int i=0; i<tempoUtilizacao; i++){
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	public String toString(){
		return id + "(" + tempoUtilizacao + ", " + tempoSolicitacao + ")" + " - " + getStatus() + " - " + getRecursos();
	}
	
	public String getRecursos(){
		String valor = "";
		
		for(int i=0; i<recursos.length; i++)
			valor = valor + recursos[i] + ", ";
		
		return valor;
	}
	
	public String getStatus(){
		return rodando ? "rodando" : "bloqueado";
	}

	public String getIdProcesso() {
		return id;
	}

	public void setId(String id) {
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
