import java.util.List;
import javax.swing.SwingWorker;

public class QQuatroThread extends SwingWorker<Void, Integer>{
	
	private int numId;
	
	public QQuatroThread(int x){
		this.numId = x;
	}
	

	@Override
	protected Void doInBackground() throws Exception {
		
		for(int i = 0; i <= 10;i++) {
			Thread.sleep(500);
			publish(i);
		}
		return null;
	}
	
	@Override
	protected void process(List<Integer> chunks) {
		for(Integer i : chunks) {
			
			QQuatro.texto.append("Thread numero: " + (numId+1) + " = " + i + "\n");
		}
	}	
	
}