import javax.swing.*;

public class QQuatro extends JFrame{
	
	JPanel painel = new JPanel();
	static JTextArea texto = new JTextArea();
	JScrollPane roda = new JScrollPane(painel);
	
	public QQuatro(){
		setSize(400, 200);
		setTitle("Questão Quatro");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		for(int i = 0; i < 5; i++) {
			new QQuatroThread(i).execute();
			
		}
		
		painel.add(texto);
		add(roda);
		setVisible(true);
	}
	
	public static void main(String[]args) {
		new QQuatro();
	}
}