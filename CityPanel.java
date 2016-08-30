//Christopher Finn (23657096)
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CityPanel extends JPanel implements ActionListener
{
	private int cTime=9;
	private int next=1;
	private int[] times= {9,11,1,4,7};
	JButton quit = new JButton("Quit");
	JButton time = new JButton("Time");
	
	public CityPanel()
	{
		setPreferredSize(new Dimension(800,600));
		this.add(quit);
		this.add(time);
		quit.addActionListener(this);
		time.addActionListener(this);
	}
	
	 public void paintComponent(Graphics g)
	 {
		 super.paintComponent(g);
		 g.drawLine(0,550,600,550);
		 g.drawRect(200, 550, 25, -30);
		 g.drawRect(225, 550, 25, -60);
		 g.drawOval(275, 495, 50, 50);
		 g.drawLine(300, 495, 300, 545);
		 g.drawLine(275, 520, 325, 520);
		 g.drawLine(280, 505, 322, 535);
		 g.drawLine(280, 535, 322, 505);
		 g.drawRect(295, 550, 10, -35);
		 g.drawRect(350, 550, 20, -90);
		 g.drawRect(359, 465, 1, -15);
		 g.fillOval(450, 450, 50, 15);
		 g.setColor(Color.white);
		 g.fillOval(465, 443, 20, 10);
		 g.setColor(Color.darkGray);
		 g.drawRect(380, 550, 1, -30);
		 g.setColor(Color.yellow);
		 g.fillOval(381, 520, 5, 3);
		 g.setColor(Color.blue);
		 g.drawLine(445, 550, 470, 464);
		 g.drawLine(480, 464, 505, 550);
		 g.setColor(Color.darkGray);
		 g.fillOval(471, 510, 5, 5);
		 g.drawLine(473, 515, 473, 522);
		 g.drawLine(469, 515, 473, 518);
		 g.drawLine(473, 518, 477, 515);
		 g.drawLine(473, 522, 477, 527);
		 g.drawLine(469, 527, 473, 522);
		 switch(cTime)
		 {
		 	case (9):
		 	{
		 		setBackground(Color.cyan);
		 		g.setColor(Color.yellow);
		 		g.fillOval(40, 250, 60, 60);
		 		g.setColor(Color.black);
		 		g.drawString("9am", 56, 325);
		 		break;
		 	}
		 	case (11):
		 	{
		 		setBackground(Color.cyan);
		 		g.setColor(Color.yellow);
		 		g.fillOval(210, 150, 60, 60);
		 		g.setColor(Color.black);
		 		g.drawString("11am", 226, 225);
		 		break;
		 	}
		 	case (1):
		 	{
		 		setBackground(Color.lightGray);
		 		g.setColor(Color.yellow);
		 		g.fillOval(340, 100, 60, 60);
		 		g.setColor(Color.black);
		 		g.drawString("1pm", 356, 175);
		 		break;
		 	}
		 	case (4):
		 	{
		 		setBackground(Color.lightGray);
		 		g.setColor(Color.yellow);
		 		g.fillOval(470, 150, 60, 60);
		 		g.setColor(Color.black);
		 		g.drawString("4pm", 485, 225);
		 		break;
		 	}
		 	case (7):
		 	{
		 		setBackground(Color.gray);
		 		g.setColor(Color.yellow);
		 		g.fillOval(600, 250, 60, 60);
		 		g.setColor(Color.black);
		 		g.drawString("7pm", 616, 325);
		 		break;
		 	}
		 }
		 
	}
	 
	 public void actionPerformed(ActionEvent e)
	 { 
		 if (e.getSource() == quit)
		 {
			 System.exit(0);
	     }
		 else
		 {
		 if(e.getSource() == time)
		 {
			if(next==5)
			{
				next=0;
			}
			cTime=times[next];
			next++;
			repaint();
		 }
		 }
	 }		
}