package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelos.SistemaOperacional;
import Interfaces.PainelInterface;

public class Painel extends JFrame {
	private JPanel painel;
	private Div divProcessos;
	private Div divRecursos;
	private Div divLogs;
	public PainelInterface delegate;
	private int count = 0;
	
	public Painel(int largura, int altura){
		super("Menu");
		
		configuraPainel(largura, altura);
		add(painel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
		
		// Construtor: - x, y, largura, altura
		divProcessos = new Div("Processos", 16, 0, largura, 150);
		divRecursos = new Div("Recursos", 16, divProcessos.yProximaDiv(), largura, 150);
		divLogs = new Div("Logs", 16, divRecursos.yProximaDiv(), largura, 150);

		adicionaComponentes(divProcessos.instancia());
		adicionaComponentes(divRecursos.instancia());
		adicionaComponentes(divLogs.instancia());
		
		divAdicionaRecurso(16);
		divAdicionaProcesso(512);
		divAdicionaSistemOperacional(800);
	}
	
	public void divAdicionaSistemOperacional(int x){
		JTextField tempoVerificacao = new JTextField("Tempo Verificacao");
		tempoVerificacao.setBounds(x, divLogs.yProximaDiv(), 150, 30);
		
		JButton botaoSistemOperacional = new JButton("Adicionar S.O");
		botaoSistemOperacional.setBounds(x, tempoVerificacao.getY()+35, 150, 30);
		
		botaoSistemOperacional.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				delegate.adicionaSO(Integer.parseInt(tempoVerificacao.getText()));
			}
		});
		
		Component[] componentes = {tempoVerificacao, botaoSistemOperacional};
		adicionaComponentes(componentes);
	}
	
	public void divAdicionaProcesso(int x){
		JTextField idProcesso = new JTextField("Id do processo");
		idProcesso.setBounds(x, divLogs.yProximaDiv(), 150, 30);
		
		JTextField tempoSolicitacaoProcesso = new JTextField("Tempo Solicitacao");
		tempoSolicitacaoProcesso.setBounds(x, idProcesso.getY()+35, 150, 30);
		
		JTextField tempoUtilizacaoProcesso = new JTextField("Tempo Solicitacao");
		tempoUtilizacaoProcesso.setBounds(x, tempoSolicitacaoProcesso.getY()+35, 150, 30);
		
		JButton botaoProcesso = new JButton("Adicionar Processo");
		botaoProcesso.setBounds(x, tempoUtilizacaoProcesso.getY()+35, 150, 30);
		
		botaoProcesso.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				divLogs.adicionaLinha("Processo adicionado com sucesso", true);
			}
		});
		
		Component[] componentes = {idProcesso, tempoSolicitacaoProcesso, tempoUtilizacaoProcesso, botaoProcesso};
		adicionaComponentes(componentes);
	}
	
	public void divAdicionaRecurso(int x){
		JTextField idRecurso = new JTextField("Id do recurso");
		idRecurso.setBounds(x, divLogs.yProximaDiv(), 150, 30);
		
		JTextField nomeRecurso = new JTextField("Nome do recurso");
		nomeRecurso.setBounds(x, idRecurso.getY()+35, 150, 30);
		
		JTextField quantidadeRecurso = new JTextField("Quantidade do recurso");
		quantidadeRecurso.setBounds(x, nomeRecurso.getY()+35, 150, 30);
		
		JButton botaoRecurso = new JButton("Adicionar Recurso");
		botaoRecurso.setBounds(x, quantidadeRecurso.getY() + 35, 150, 30);
		
		botaoRecurso.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				delegate.adicionaRecurso(Integer.parseInt(idRecurso.getText()), nomeRecurso.getText(), Integer.parseInt(quantidadeRecurso.getText()));
			}
		});
		
		Component[] componentes = {idRecurso, nomeRecurso, quantidadeRecurso, botaoRecurso};
		adicionaComponentes(componentes);
	}
	
	public void configuraPainel(int largura, int altura){
		Dimension preferredSize = new Dimension(largura, altura);
		painel = new JPanel();
		painel.setPreferredSize(preferredSize);
		painel.setLayout(null);
	}
	
	private void adicionaComponentes(Component[] componentes){
		for(int i=0; i<componentes.length; i++)
			painel.add(componentes[i]);
	}
		
	public void exibir(Boolean opcao) {
		setVisible(opcao);
	}
	
	public void adicionaMensagemDeLog(String mensagem){
		divLogs.adicionaLinha(++count + ": " + mensagem, true);
	}
	
	public void adicionaMensagemRecurso(String mensagem){
		divRecursos.adicionaLinha(mensagem, false);
	}
	
	public void setMensagemRecurso(String mensagem, int index) {
		divRecursos.setMensagemRecurso(mensagem, index);
	}
}
