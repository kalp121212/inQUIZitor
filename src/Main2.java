
import java.awt.Image;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.*;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

@SuppressWarnings("restriction")
public class Main2 {

	JFrame f;
	JButton play,instr,exit,a;
	JLabel title;
	
	public Main2()
	{	
		f = new JFrame("WELCOME TO inQUIZitor");
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("D:\\kbc_img.jpg"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		Image dimg = img.getScaledInstance(600, 600, Image.SCALE_SMOOTH);
		ImageIcon imageicon = new ImageIcon(dimg);
		f.setContentPane(new JLabel(imageicon));
		
		
		title = new JLabel();
		play = new JButton("PLAY");
		instr = new JButton("INSTRUCTIONS");
		exit = new JButton("EXIT");
		a = new JButton("y");
		
		title.setBounds(200,20,200,200);
		play.setBounds(200,200,150,50);
		instr.setBounds(200,300,150,50);
		exit.setBounds(220,400,100,50);
		a.setBounds(200, 500, 100, 100);
		
		f.add(title);
		f.add(instr);
		f.add(exit);
		f.add(play);
		f.add(a);
		
		a.setVisible(false);
		
		f.setVisible(true);
		f.setSize(600, 600);
		f.setLayout(null);
		
		InputStream in = null;

		AudioStream as = null;

		try

		{

		//create audio data source

		in = new FileInputStream("D:\\kbc_audio.wav");

		}

		catch(FileNotFoundException fnfe)

		{

		System.out.println("Theo file was not found");

		}

		try

		{

		//create audio stream from file stream

		as = new AudioStream(in);

		}

		catch(IOException ie)

		{

		System.out.println("Audioam could not be created");

		}
	
		AudioPlayer.player.start(as);
		
		
		play.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						playcommand(e);
						InputStream in = null;

						AudioStream as = null;

						try

						{

						//create audio data source

						in = new FileInputStream("D:\\kbc_audio.wav");

						}

						catch(FileNotFoundException fnfe)

						{

						System.out.println("Theo file was not found");

						}

						try

						{

						//create audio stream from file stream

						as = new AudioStream(in);

						}

						catch(IOException ie)

						{

						System.out.println("Audioam could not be created");

						}
					
						AudioPlayer.player.start(as);
					}
				}
		);
		
		instr.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						instrcommand(e);
					}
				}
		);
		
		exit.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						f.dispose();
						JOptionPane.showMessageDialog(f,"THANK YOU FOR PLAYING...EXITING NOW");
					}
				}
		);
	}
	public void playcommand(ActionEvent e)
	{
		f.dispose();
		new frame();
		
	}
	
	public void instrcommand(ActionEvent e)
	{
		f.dispose();
		new page2();
	}
	
	public static void main(String Args[])
	{
		new Main2();
	}
	
}

