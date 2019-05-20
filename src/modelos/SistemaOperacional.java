package modelos;

import java.util.ArrayList;
import java.util.Random;

import Interfaces.SistemaOperacionaInterface;

public class SistemaOperacional implements Runnable {
	//tempo em segundos
	private int tempoVerificaDeadlock;
	private ListaDeRecursos recursos;
	private Random gerador;
	
	public SistemaOperacionaInterface delegate;

	public SistemaOperacional(int tempoVerificaDeadlock) {
		super();
		this.tempoVerificaDeadlock = tempoVerificaDeadlock;
		this.recursos = new ListaDeRecursos();
		this.gerador = new Random();
	}
	
	@Override
	public void run() {
		//thread
		while(true){
			System.out.println("voltou");
			try {
				this.wait(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			delegate.adicionaLog("Verifica deadlock");
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
