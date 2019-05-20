package views;

import java.awt.Component;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Div {
	
	private DefaultListModel<String> listModel;
	private JList jList;
	private JLabel label;
	private JScrollPane scrollPane;
	
	public Div(String titulo, int x, int y, int largura, int altura){
		scrollPane = new JScrollPane();
		
		label = new JLabel(titulo);
		listModel = new DefaultListModel<String>();
		jList = new JList(listModel);
		label.setBounds(x, y, largura - 32, 15);
		scrollPane.setBounds(x, y+20, largura - 32, altura);
		scrollPane.setViewportView(jList);
	}
	
	public void adicionaLinha(String valor, Boolean first){
		if(first){
			listModel.insertElementAt(valor, 0);
		}else {
			listModel.addElement(valor);
		}
		
	}
	
	public void setMensagemRecurso(String mensagem, int index) {
		listModel.set(index, mensagem);
	}
	
	public Component[] instancia(){
		Component[] componentes = {label, scrollPane};
		return componentes;
	}
	
	public int yProximaDiv(){
		return scrollPane.getY() + scrollPane.getHeight() + 5;
	}

}
