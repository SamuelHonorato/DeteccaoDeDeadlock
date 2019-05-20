package modelos;

import Interfaces.PainelInterface;
import Interfaces.SistemaOperacionaInterface;
import views.Painel;

public class Controller implements PainelInterface, SistemaOperacionaInterface {

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
		
		this.sistemaOperacional.run();
	}
	
	public void adicionaProcesso(Processo processo){
		listaDeProcessos.adicionaProcesso(processo);
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
