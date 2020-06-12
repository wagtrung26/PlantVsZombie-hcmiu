import java.awt.event.ActionEvent;
import javax.swing.Timer;


public class Sunflower extends Plant{

	Timer sunProduceTimer;

	public Sunflower(Game gp, int x, int y) {
		super(gp, x, y);
		sunProduceTimer = new Timer(15000,(ActionEvent e) -> {
            Sun s = new Sun(gp,60 + x*100,110 + y*120,130 + y*120);
            gp.activeSuns.add(s);
            gp.add(s,new Integer(1));
        });
        sunProduceTimer.start();
	}
	
}
