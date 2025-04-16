import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class QDois extends JFrame{
	JButton butao;
	JTextArea areaTexto = new JTextArea(10,30);
	JScrollPane roda;	
	
	public QDois() {
		setSize(400, 200);
		setResizable(false);
		setTitle("Questão Dois");
		//setLayout(new FlowLayout());
		
	    areaTexto.setEditable(false);
	    areaTexto.setTabSize(50);
		
		
		butao = new JButton("*Iniciar Processo*");
		butao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				areaTexto.append("Processo Iniciado.... \n");
				
			}
			
		});
		
		roda = new JScrollPane(areaTexto);
		
		add(roda, BorderLayout.CENTER);
		add(butao, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[]args) {
		new QDois();
		
	}
}