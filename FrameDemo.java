import javax.swing.JFrame;
                                                                                                                        
import java.awt.BorderLayout;
class  FrameDemo
{
	public static void main(String[] args) 
	{
		JFrame jf=new JFrame("Game");
		jf.setLayout(new BorderLayout()); /*I can only keep 5 component in Border layout and we have justify it also like in right left otherwise it will keep 5 in centre by default */
		jf.setSize(500,500);//Values in pixel
		jf.setVisible(true);
	}
}
//Edit plus and notepad are fake
//Desktop application are JFrame based