package modelos;

import java.util.ArrayList;

public class ListaDeRecursos {
	private ArrayList<Recurso> recursos;
	private final int MAXIMO_RECURSOS = 10;
	private int index = 0;
	
	public ListaDeRecursos() {
		super();
		this.recursos = new ArrayList<Recurso>();
	}
	
	public int quantidade() {
		return recursos.size();
	}
	
	public Recurso getRecurso(int index){
		return recursos.get(index);
	}
	
	public void adiciona(String nome, int quantidade) {
		Recurso recurso = new Recurso(nome, index++, quantidade);
		if(recursos.size() <= MAXIMO_RECURSOS) {
			recursos.add(recurso);
		}
	}
}
