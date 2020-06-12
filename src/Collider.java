import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Collider extends JPanel implements MouseListener {

	ActionListener a;

    public Collider(){
    	setOpaque(false);
        addMouseListener(this);
        setSize(100,120);
    }

    public Plant plant;

    public void setPlant(Plant p){
        plant = p;
    }

    public void removePlant(){
        plant.stop();
        plant = null;
    }

    public boolean isInsideCollider(int t){
        return (t > getLocation().x) && (t < getLocation().x + 100);
    }

    public void setAction(ActionListener al){
        this.a = al;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(a != null){
            a.actionPerformed(new ActionEvent(this,ActionEvent.RESERVED_ID_MAX+1,""));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
