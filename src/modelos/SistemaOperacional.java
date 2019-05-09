package modelos;

import java.util.ArrayList;
import java.util.Random;

public class SistemaOperacional implements Runnable {
	//tempo em segundos
	private int tempoVerificaDeadlock;
	private ListaDeRecursos recursos;
	private Random gerador;

	public SistemaOperacional(int tempoVerificaDeadlock) {
		super();
		this.tempoVerificaDeadlock = tempoVerificaDeadlock;
		this.recursos = new ListaDeRecursos();
		this.gerador = new Random();
	}
	
	@Override
	public void run() {
		//thread
	}
	
	public Recurso pegaRecurso(){
		int index = gerador.nextInt(recursos.quantidade());
		return recursos.getRecurso(index);
	}
	
	public ArrayList<Processo> verificaDeadlock() {
		return new ArrayList<Processo>();
	}
}
