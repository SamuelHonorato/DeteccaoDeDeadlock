package modelos;

import java.util.ArrayList;
import java.util.Random;

import Interfaces.LogInterface;

public class SistemaOperacional extends Thread {
	//tempo em segundos
	private int tempoVerificaDeadlock;
	private ListaDeRecursos recursos;
	private Random gerador;
	
	public LogInterface delegate;

	public SistemaOperacional(int tempoVerificaDeadlock) {
		super();
		this.tempoVerificaDeadlock = tempoVerificaDeadlock;
		this.recursos = new ListaDeRecursos();
		this.gerador = new Random();
	}
	
	@Override
	public void run() {
		//thread
		
		while(true) {
			delegate.adicionaLog("Verifica deadlock");
			
			for(int i=0; i<tempoVerificaDeadlock; i++) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void adicionaRecurso(int id, String nome, int quantidade){
		recursos.adiciona(nome, quantidade);
	}
	
	public Recurso pegaRecurso(){
		int index = gerador.nextInt(recursos.quantidade());
		return recursos.getRecurso(index);
	}
	
	public ArrayList<Processo> verificaDeadlock() {
		return new ArrayList<Processo>();
	}
	
	public String toString(){
		return "Sistema Operacional - Tempo de verificacao: " + tempoVerificaDeadlock + " segundos.";
	}
}
