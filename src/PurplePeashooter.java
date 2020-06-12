import java.awt.event.ActionEvent;

import javax.swing.Timer;


public class PurplePeashooter extends Plant{
	public Timer shoot;
	public PurplePeashooter(Game gm, int x, int y) {
		super(gm, x, y);
		shoot = new Timer(2000, (ActionEvent e) ->{
			if(game.laneZombies.get(y).size() > 0) {
                game.lanePeas.get(y).add(new FreezePea(game, y, 103 + this.x * 100));
            }
		});
		shoot.start();
	}
	public void stop(){
		shoot.stop();
	}
}
