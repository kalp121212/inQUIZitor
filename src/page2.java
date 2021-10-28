import javax.swing.*;
import java.awt.event.*;

public class page2 {
	
	JFrame f;
	JButton play;
	JLabel instr,a1,a2,a3,a32,a33,a4,a41,a5;
	
	public page2()
	{
		f = new JFrame("KBC");
		
		play = new JButton("BACK");
		instr = new JLabel("INSTRUCTIONS: ");
		a1 = new JLabel("This is a different version of famous TV show Kaun Banega Crorepati");
		a2 = new JLabel("There will be 9 questions with 4 options for each question...The below lifelines are available");
		a3 = new JLabel("1. Double Dip(DD): You will get two chances to guess the answer");
		a32 = new JLabel("2. 50:50: Two options will disappear");
		a33 = new JLabel("3. Flip: You can choose to change yr given question and answer another question");
		a4 = new JLabel("Each lifeline can be used only once...When DD is used, you can not quit the game.");
		a41 = new JLabel("Beware - The lifelines can not be used for the last question");
		a5 = new JLabel("y");
		
		
		play.setBounds(200,450,100,50);
		instr.setBounds(200,50,100,20);
		a1.setBounds(100,100,600,20);
		a2.setBounds(100,150,600,20);
		a3.setBounds(100,200,600,20);
		a32.setBounds(100,250,600,20);
		a33.setBounds(100,300,600,20);
		a4.setBounds(100,350,600,20);
		a41.setBounds(100,400,600,20);
		a5.setBounds(100,250,400,20);
		
		f.add(play);
		f.add(instr);
		f.add(a1);
		f.add(a2);
		f.add(a3);
		f.add(a32);
		f.add(a33);
		f.add(a4);
		f.add(a41);
		f.add(a5);
		
		f.setVisible(true);
		f.setSize(800, 600);
		f.setLayout(null);
		
		play.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						playcommand(e);
					}
				}
		);
		
	}
	
	public void playcommand(ActionEvent e)
	{
		f.dispose();
		new Main2();
	}
	
	public static void main(String Args[])
	{
		new page2();
	}
}
