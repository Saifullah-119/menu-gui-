import java.awt.*;
import javax.swing.*;
class MenuGUI
{
	public static void main(String args[])
	{
		JFrame frm=new JFrame();
		Container con=frm.getContentPane();
		JTextArea txtj=new JTextArea();
		con.add(txtj);
		JMenuBar mb= new JMenuBar(); //creates menu bar
		JMenu[] mn = new JMenu[6]; //creates a single menu
		JMenuItem[][] mi=new JMenuItem[6][]; //creates an item of a menu 
		frm.add(mb,BorderLayout.NORTH);
		
		mn[0]=new JMenu("File");
		mn[1]=new JMenu("Edit");
		mn[2]=new JMenu("Format");
		mn[3]=new JMenu("View");
		mn[4]=new JMenu("Help");
		mn[5]=new JMenu("Custom");
		
		
		for(int i=0;i<mn.length;i++)
		{	
			//mn[i].setMnemonic(KeyEvent.VK_A); //set an alt shortcut 
			//mn[i].getAccessibleContext().setAccessibleDescription("Menu #"+i); //Description 
			mb.add(mn[i]);			//Adds Menu to menubar
			mn[i].setVisible(true);
		}
		for(int i=0;i<mn.length;i++)
		{
			for(int j=0;j<mn[].length;j++)
			{
				
			}
		}
		/*FlowLayout flw=new FlowLayout();
		con.setLayout(flw);
		
		
		JButton btn=new JButton("Test");
		con.add(btn);*/
		
		frm.setSize(400,400);
		frm.setVisible(true);
		mb.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}