package modelos;

import Interfaces.PainelInterface;
import Interfaces.LogInterface;
import views.Painel;

public class Controller implements PainelInterface, LogInterface {

	private Painel painel;
	private SistemaOperacional sistemaOperacional;
	private ListaDeProcessos listaDeProcessos;
	
	public Controller(){
		painel = new Painel(1220, 680);
		painel.exibir(true);
		painel.delegate = this;
		
		listaDeProcessos = new ListaDeProcessos();
	}
	
	@Override
	public void adicionaSO(int tempoDeVerificacao) {
		this.sistemaOperacional = new SistemaOperacional(tempoDeVerificacao);
		this.sistemaOperacional.delegate = this;
		
		adicionaLog(sistemaOperacional.toString());
		
		this.sistemaOperacional.start();
	}
	
	public void adicionaProcesso(String id, int tempoSolicitacao, int tempoUtilizacao){
		Processo processo = new Processo(id, tempoSolicitacao, tempoUtilizacao);
		listaDeProcessos.adicionaProcesso(processo);
		adicionaLog(id + "(" + tempoSolicitacao + ", " + tempoUtilizacao + "): adicionado" );
		painel.adicionaMensagemProcesso(id);
	}
	
	public void adicionaRecurso(int id, String nome, int quantidade){
		this.sistemaOperacional.adicionaRecurso(id, nome, quantidade);
		adicionaLog(nome + "(" + quantidade + "): adicionado" );
		painel.adicionaMensagemRecurso(nome);
	}
	
	@Override
	public void adicionaLog(String mensagem) {
		// TODO Auto-generated method stub
		painel.adicionaMensagemDeLog(mensagem);
	}
}
