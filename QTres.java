import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class QTres extends JFrame{
	JButton butao;
	static JPanel painel = new JPanel();
	
	public QTres() {
		setSize(400, 200);
		setResizable(false);
		setTitle("Questão Tres");
		setLayout(new BorderLayout());
		
		
		butao = new JButton("Inicializar");
		butao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent iniciado) {
				
				novoDowload();	
			}
		});
		
		add(painel, BorderLayout.CENTER);
		add(butao, BorderLayout.NORTH);
		setVisible(true);
	}
	
	private void novoDowload() {
		JProgressBar barra = new JProgressBar(0, 100);
		painel.add(barra);
		painel.revalidate();
		
		new QTresThread(barra).execute();
		
	}
	
	public static void main(String[]args) {
		new QTres();
	}
	
}