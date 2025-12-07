import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;
class GameDemo 
{
	static int x=250,y=1,x1,y1;
	static Can c1=null;
	public static void main(String[] args) 
	{
		
		JFrame jf=new JFrame("Game");
		jf.setLayout(new BorderLayout());
		jf.setSize(500,500);
		Panel pn=new Panel();
		jf.add(pn,"South");
		JButton jb=new JButton(" << ");
		JButton jb1=new JButton (" >> ");
		pn.add(jb);
		pn.add(jb1);
		c1=new Can();
		jf.add(c1);
		jb.addActionListener(new XYZ()); /*Event of Button we use addActionListener What do we have to do(event) on button click*/
		jb1.addActionListener(new XYZ());
		jf.setVisible(true);
	}
	
	static class XYZ implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			JButton	bt=(JButton)ae.getSource();
			String s1=bt.getText();
			if(s1.equals(" << "))
			{
				x=x-15;
			}else{
				x=x+15;
			}
			c1.repaint();
		}
	}
	
	static class Can extends Canvas implements Runnable
	{
		int r1=0,g1=0,b1=0;
		Can()
		{
			Thread t1=new Thread(this);
			t1.start();
		}
		public void paint(Graphics g)
		{
			Color col=new Color(r1,g1,b1);
			g.setColor(col);
			g.fillRect(x,y,20,30);
	}
	public void run()
		{
		while(true){
		if(y<400){
			y+=2;
				try{
					Thread.sleep(80);
					repaint();
				}catch(Exception tt)
			{}
		}
				else{
					x=(int)(Math.random()*400);
					y=1;
					r1=(int)(Math.random()*255);
					g1=(int)(Math.random()*255);
					b1=(int)(Math.random()*255);
				}
		}
		}
			
}
}

//Q. We have to stop bricks at fix and arrangement by method.
/*	Listener				Interface
	addMouseListener		MouseListener
	
							p v mouseClicked(MouseEvent me)
							p v mousePressed(MouseEvent me)
							p v mouseReleased(MouseEvent me)
							p v mouseEntered(MouseEvent me)
							p v mouseExited(MouseEvent me)
							
							
						AdapterClass
							MouseAdapter
							
	addMouseMotionListener  MouseMotionListener
							p v mouseMoved(MouseEvent me)
							p v mouseDragged(MouseEvent me)
							
							
						AdapterClass
							MouseMotionAdapter			*/
							
							
							
							

