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
			//processo.executa();
			processo.start();
		}
	}
	
	public void eliminaProcesso(String id) {
		int index = pegaProcesso(id);
		processos.get(index).elimina();
		processos.remove(index);
	}
	
	public int pegaProcesso(String id) {
		int index = -1;
		for(int i = 0; i < processos.size(); i++) 
			if(processos.get(i).getIdProcesso().equalsIgnoreCase(id)) 
				index = i;
		
		return index;
	}
}
