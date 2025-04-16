import java.util.List;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class QTresThread extends SwingWorker<Void, Integer>{
	JProgressBar sim = new JProgressBar(0, 100);

	public QTresThread(JProgressBar x) {
		this.sim= x;	
	}
	
	@Override
	protected Void doInBackground() throws Exception {
		
		for(int i = 0; i<=100;i++) {
			
			
			Thread.sleep(100);
			publish(i);
		}
		return null;
	}	
	
	@Override
	protected void process(List<Integer> chunks) {
		for(Integer i : chunks) {
			sim.setValue(i);
			QTres.painel.revalidate();
		}
	}		
	
	@Override
    protected void done() {

		sim.setValue(100); 
    }
}