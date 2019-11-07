import java.awt.Rectangle;


public class FreezePea extends Pea {

    public FreezePea(Game game,int lane,int startX){
        super(game,lane,startX);
    }

    @Override
    public void move(){
        Rectangle pRect = new Rectangle(x,130+lane*120,28,28);
        for (int i = 0; i < game.laneZombies.get(lane).size(); i++) {
            Zombie z = game.laneZombies.get(lane).get(i);
            Rectangle zRect = new Rectangle(z.x,109 + lane*120,400,120);
            if(pRect.intersects(zRect)){
                z.health -= 300;
                z.slow();
                boolean exit = false;
                if(z.health < 0){
                    //System.out.println("ZOMBIE DIE");
                    game.laneZombies.get(lane).remove(i);
                    game.checkLevel(10);
                    exit = true;
                }
                game.lanePeas.get(lane).remove(this);
                if(exit) break;
            }
        }
        x += 15;
    }

}
