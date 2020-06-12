import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Menu extends JPanel{
	Image menu;
	JPanel jp;
	public Menu(){
		
		setSize(1024,800);
		paint();
		menu  = new ImageIcon(this.getClass().getResource("images\\plants\\intro.gif")).getImage();
		System.out.println("Start\n");
	}
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(menu,10,0,null);
        
    }
	public void paint(){
		jp = new JPanel();
		jp.setOpaque(false);
		jp.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
                jpMouseClicked(e);
            }
		});
		GroupLayout fLayout = new GroupLayout(jp);
		jp.setLayout(fLayout);
		fLayout.setHorizontalGroup(
				fLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addGap(0, 800, Short.MAX_VALUE)
	        );
				fLayout.setVerticalGroup(
				fLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addGap(0, 1024, Short.MAX_VALUE)
	        );

	    GroupLayout layout = new GroupLayout(this);
	    this.setLayout(layout);
	    layout.setHorizontalGroup(
	    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	          .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	          .addComponent(jp, GroupLayout.PREFERRED_SIZE
	        		  ,GroupLayout.DEFAULT_SIZE
	        		  ,GroupLayout.PREFERRED_SIZE)
	                )
	      );
	    layout.setVerticalGroup(
	    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	          .addGroup(layout.createSequentialGroup()
	          .addComponent(jp, GroupLayout.PREFERRED_SIZE
	            		,GroupLayout.DEFAULT_SIZE
	            		,GroupLayout.PREFERRED_SIZE)
	                )
	      );
	}
	
	private void jpMouseClicked(MouseEvent evt) {
        Window.begin();
    }
}
