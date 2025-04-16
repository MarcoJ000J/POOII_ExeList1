import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class QUm extends JFrame{
	private JLabel texto = new JLabel("");
	private JTextField input = new JTextField(50);
	private JButton butao;
	
	public QUm() {
		setSize(800,400);
		setTitle("Queatão 1");
		setLayout(new FlowLayout());
		
		
		butao = new JButton("Enviar Texto");
		butao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String inscrivinhado =  input.getText();	
				texto.setText("Texto inscrivinhado acima :  " + inscrivinhado);
			}
		});
		
		add(input);
		add(butao);
		add(texto);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	public static void main(String[]args) {
		new QUm();
	}
	
}