package modelos;

import java.util.ArrayList;

public class ListaDeProcessos {

	private ArrayList<Processo> processos;
	private final int MAXIMO_PROCESSOS = 15;
	
	public ListaDeProcessos() {
		super();
		this.processos = new ArrayList<Processo>();
	}
	
	public void adicionaProcesso(Processo processo) {
		if(processos.size() <= MAXIMO_PROCESSOS) {
			processos.add(processo);
			processo.executa();
		}
	}
	
	public void eliminaProcesso(int id) {
		int index = pegaProcesso(id);
		processos.get(index).elimina();
		processos.remove(index);
	}
	
	public int pegaProcesso(int id) {
		int index = -1;
		for(int i = 0; i < processos.size(); i++) 
			if(processos.get(i).getId() == id) 
				index = i;
		
		return index;
	}
}
