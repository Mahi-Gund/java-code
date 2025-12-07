import java.awt.*;
import  java.awt.event.*;
import javax.swing.*;
class MouseDemo1
{
	public static void main(String[] args) 
	{
		JFrame jf=new JFrame("MouseDemo");
		jf.setLayout(new BorderLayout());
		jf.setSize(500,500);
		Can c1=new Can();
		jf.add(c1);
		jf.setVisible(true);
	}
	
	static class Can extends Canvas
	{
		int x1,y1,x2,y2;
		Can ()
			{
			addMouseMotionListener(new XYZ());
			}
		
		public void paint(Graphics g)
		{
			g.fillOval(x1,y1,30,30);
		}
		class XYZ extends MouseMotionAdapter
		{
			public void mouseDragged(MouseEvent me)
			{
				x1=me.getX();
				y1=me.getY();
				repaint();
			}
			
		}
	}
}

/*Square to draw square till the cursor ends 
  Rectangle
  Oval
  How to add image on canvas*/
  
