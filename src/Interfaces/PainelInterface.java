package Interfaces;

import modelos.SistemaOperacional;

public interface PainelInterface {
	public void adicionaSO(int tempoDeVerificacao);
	public void adicionaRecurso(int id, String nome, int quantidade);
}
