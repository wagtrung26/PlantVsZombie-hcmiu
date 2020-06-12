import java.awt.event.ActionEvent;

import javax.swing.Timer;


public class Peashooter extends Plant{

	
	public Timer shoot;
	public Peashooter(Game gp, int x, int y) {
		super(gp, x, y);
		shoot = new Timer(2000,(ActionEvent e) -> {
            //System.out.println("SHOOT");
            if(gp.laneZombies.get(y).size() > 0) {
                gp.lanePeas.get(y).add(new Pea(gp, y, 103 + this.x * 100));
            }
        });
        shoot.start();
	}
	public void stop(){
		shoot.stop();
	}
}
