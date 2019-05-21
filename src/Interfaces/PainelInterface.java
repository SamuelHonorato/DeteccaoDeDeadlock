package Interfaces;

public interface PainelInterface {
	public void adicionaSO(int tempoDeVerificacao);
	public void adicionaRecurso(int id, String nome, int quantidade);
	public void adicionaProcesso(String id, int tempoSolicitacao, int tempoVerificacao);
}
