import java.awt.*;

import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.text.MessageFormat;
import sun.audio.*;

import javax.imageio.ImageIO;
import javax.swing.*;
//import javax.swing.border.EmptyBorder;

public class frame {
	
	static JFrame f;
	JLabel head;
	JButton opt1,opt2,opt3,opt4,next,d_dip,f_50,quit,flip,a,time;
	JTextField q,dis;
	String questions[][];
	String options[][][];
	int correct;
	int user_ans;
	int ans[][];
	static int y=0;
	static int x;
	static int l=0;
	static int z=0;
	static int k=0;
	static int n=0;
	static int m=6;
	static int u=0;
	String prize[];
	static String m_won="";
	int x1;
    static Timer timer = null;
  
        
	
	public void opt1ActionPerformed(ActionEvent e)
	{
		if(correct == 1)
		{	
			playAudio("D:\\Quiz-correct-sound-with-applause (1).wav");
			if(n==9)
			{	playAudio("D:\\winning.wav");
				dis.setText("Congratulations!!!....You have won the final trophy!!!");
				opt1.setBackground(Color.GREEN);
				opt1.setEnabled(false);
				opt2.setEnabled(false);
				opt3.setEnabled(false);
				opt4.setEnabled(false);
				d_dip.setEnabled(false);
				f_50.setEnabled(false);
				flip.setEnabled(false);
				x=0;
				y=0;
				z=0;
				k=0;
				l=0;
				n=0;
				
				JOptionPane.showMessageDialog(f, "Congrats on winning!!");
				f.dispose();
				new Main2();
			}
			else
			{
			dis.setText("CORRECT ANSWER!!!");
			opt1.setBackground(Color.GREEN);
			next.setEnabled(true);
			y=0;
			
			opt1.setEnabled(false);
			opt2.setEnabled(false);
			opt3.setEnabled(false);
			opt4.setEnabled(false);
			d_dip.setEnabled(false);
			f_50.setEnabled(false);
			flip.setEnabled(false);
			quit.setEnabled(false);
			}
		}
		else
		{	
			playAudio("D:\\Wrong-answer-sound-effect.wav");
			if(y==0)
			{
			if(correct == 2)
			{	dis.setText("CORRECT ANSWER!!!");
				opt2.setBackground(Color.GREEN);
			}
		
		if(correct == 3)
		{	dis.setText("CORRECT ANSWER!!!");
			opt3.setBackground(Color.GREEN);
		}
		
		if(correct == 4)
		{	dis.setText("CORRECT ANSWER!!!");
			opt4.setBackground(Color.GREEN);
		}
			
			dis.setText("WRONG ANSWER!!!");
			opt1.setBackground(Color.RED);
			next.setEnabled(false);
			
			opt2.setEnabled(false);
			opt3.setEnabled(false);
			opt4.setEnabled(false);
			d_dip.setEnabled(false);
			f_50.setEnabled(false);
			flip.setEnabled(false);
			x=0;
			y=0;
			z=0;
			k=0;
			l=0;
			n=0;
			
			String s = MessageFormat.format("Prize won: {0}, Thank You for playing!! ", m_won);
			
			JOptionPane.showMessageDialog(f, s);
			f.dispose();
			new Main2();
		}
			else
			{
				y=0;
				opt1.setEnabled(false);
				opt1.setBackground(Color.RED);
			}
		}
		
		
		user_ans = 1;	
	}
	
	public void opt2ActionPerformed(ActionEvent e)
	{
		if(correct == 2)
		{	playAudio("D:\\Quiz-correct-sound-with-applause (1).wav");
			if(n==9)
			{
				playAudio("D:\\winning.wav");
				dis.setText("Congratulations!!!....You have won the final trophy!!!");
				opt2.setBackground(Color.GREEN);
				opt1.setEnabled(false);
				opt2.setEnabled(false);
				opt3.setEnabled(false);
				opt4.setEnabled(false);
				d_dip.setEnabled(false);
				f_50.setEnabled(false);
				
				x=0;
				y=0;
				z=0;
				k=0;
				l=0;
				n=0;
				
				JOptionPane.showMessageDialog(f, "Congrats on winning!!");
				f.dispose();
				new Main2();
			}
			else{
			dis.setText("CORRECT ANSWER!!!");
			opt2.setBackground(Color.GREEN);
			next.setEnabled(true);
			y=0;
			
			opt1.setEnabled(false);
			opt2.setEnabled(false);
			opt3.setEnabled(false);
			opt4.setEnabled(false);
			d_dip.setEnabled(false);
			f_50.setEnabled(false);
			flip.setEnabled(false);
			quit.setEnabled(false);
			}
		}
		else
		{	playAudio("D:\\Wrong-answer-sound-effect.wav");
			if(y==0)
			{
			if(correct == 1)
			{	dis.setText("CORRECT ANSWER!!!");
				opt1.setBackground(Color.GREEN);
			}
			
			if(correct == 3)
			{	dis.setText("CORRECT ANSWER!!!");
				opt3.setBackground(Color.GREEN);
			}
			
			if(correct == 4)
			{	dis.setText("CORRECT ANSWER!!!");
				opt4.setBackground(Color.GREEN);
			}
			
			dis.setText("WRONG ANSWER!!!");
			opt2.setBackground(Color.RED);
			next.setEnabled(false);
			
			opt1.setEnabled(false);
			opt3.setEnabled(false);
			opt4.setEnabled(false);
			d_dip.setEnabled(false);
			f_50.setEnabled(false);
			quit.setEnabled(true);
			flip.setEnabled(false);
			x=0;
			y=0;
			z=0;
			k=0;
			l=0;
			n=0;
			
			String s = MessageFormat.format("Prize won: {0}, Thank You for playing!! ", m_won);
			
			JOptionPane.showMessageDialog(f, s);
			f.dispose();
			new Main2();
			}
			else
			{
				y=0;
				opt2.setEnabled(false);
				opt2.setBackground(Color.RED);
			}
		}
		
		user_ans = 2;	
	}
	
	public void opt3ActionPerformed(ActionEvent e)
	{	
		if(correct == 3)
		{	playAudio("D:\\Quiz-correct-sound-with-applause (1).wav");
			if(n==9)
			{	playAudio("D:\\winning.wav");
				dis.setText("Congratulations!!!....You have won the final trophy!!!");
				opt3.setBackground(Color.GREEN);
				opt1.setEnabled(false);
				opt2.setEnabled(false);
				opt3.setEnabled(false);
				opt4.setEnabled(false);
				d_dip.setEnabled(false);
				f_50.setEnabled(false);
				flip.setEnabled(false);
				x=0;
				y=0;
				z=0;
				k=0;
				l=0;
				n=0;
				
				JOptionPane.showMessageDialog(f, "Congrats on winning!!");
				f.dispose();
				new Main2();
			}
			else{
			dis.setText("CORRECT ANSWER!!!");
			opt3.setBackground(Color.GREEN);
			next.setEnabled(true);
			
			opt1.setEnabled(false);
			opt2.setEnabled(false);
			opt3.setEnabled(false);
			opt4.setEnabled(false);
			d_dip.setEnabled(false);
			f_50.setEnabled(false);
			flip.setEnabled(false);
			quit.setEnabled(false);
			y=0;
		}}
		else
		{	playAudio("D:\\Wrong-answer-sound-effect.wav");
			if(y==0)
			{
			if(correct == 1)
			{	dis.setText("CORRECT ANSWER!!!");
				opt1.setBackground(Color.GREEN);
			}
			if(correct == 2)
			{	dis.setText("CORRECT ANSWER!!!");
				opt2.setBackground(Color.GREEN);
			}
			if(correct == 4)
			{	dis.setText("CORRECT ANSWER!!!");
				opt4.setBackground(Color.GREEN);
			}
			
			dis.setText("WRONG ANSWER!!!");
			opt3.setBackground(Color.RED);
			next.setEnabled(false);
			
			opt1.setEnabled(false);
			opt2.setEnabled(false);
			opt4.setEnabled(false);
			d_dip.setEnabled(false);
			f_50.setEnabled(false);
			quit.setEnabled(true);
			flip.setEnabled(false);
			x=0;
			y=0;
			z=0;
			k=0;
			l=0;
			n=0;
			
String s = MessageFormat.format("Prize won: {0}, Thank You for playing!! ", m_won);
			
			JOptionPane.showMessageDialog(f, s);
			f.dispose();
			new Main2();
			}
			else
			{
				y=0;
				opt3.setEnabled(false);
				opt3.setBackground(Color.RED);
			}
		}
	
		user_ans = 3;	
	}
	
	public void opt4ActionPerformed(ActionEvent e)
	{	
		if(correct == 4)
		{	playAudio("D:\\Quiz-correct-sound-with-applause (1).wav");
			if(n==9)
			{	playAudio("D:\\winning.wav");
				dis.setText("Congratulations!!!...You have won the final trophy!!!");
				opt4.setBackground(Color.GREEN);
				opt1.setEnabled(false);
				opt2.setEnabled(false);
				opt3.setEnabled(false);
				opt4.setEnabled(false);
				d_dip.setEnabled(false);
				f_50.setEnabled(false);
				flip.setEnabled(false);
				x=0;
				y=0;
				z=0;
				k=0;
				l=0;
				n=0;
				
				JOptionPane.showMessageDialog(f, "Congrats on winning!!");
				f.dispose();
				new Main2();
			}
			
			else
			{
			
			dis.setText("CORRECT ANSWER!!!");
			opt4.setBackground(Color.GREEN);
			next.setEnabled(true);
			
			opt1.setEnabled(false);
			opt2.setEnabled(false);
			opt3.setEnabled(false);
			opt4.setEnabled(false);
			d_dip.setEnabled(false);
			f_50.setEnabled(false);
			flip.setEnabled(false);
			quit.setEnabled(false);
			y=0;
		}}
		else
		{	playAudio("D:\\Wrong-answer-sound-effect.wav");
			if(y==0)
			{	
			if(correct == 1)
			{	dis.setText("CORRECT ANSWER!!!");
				opt1.setBackground(Color.GREEN);
			}
			
			if(correct == 2)
			{	dis.setText("CORRECT ANSWER!!!");
				opt2.setBackground(Color.GREEN);
			}
			
			if(correct == 3)
			{	dis.setText("CORRECT ANSWER!!!");
				opt3.setBackground(Color.GREEN);
			}
			
			dis.setText("WRONG ANSWER!!!");
			opt4.setBackground(Color.RED);
			next.setEnabled(false);
			
			opt1.setEnabled(false);
			opt2.setEnabled(false);
			opt3.setEnabled(false);
			d_dip.setEnabled(false);
			f_50.setEnabled(false);
			quit.setEnabled(true);
			flip.setEnabled(false);
			x=0;
			y=0;
			z=0;
		k=0;
			l=0;
			n=0;
			
String s = MessageFormat.format("Prize won: {0}, Thank You for playing!! ", m_won);
			
			JOptionPane.showMessageDialog(f, s);
			new Main2();
			f.dispose();
			}
			else
			{
				opt4.setEnabled(false);
				opt4.setBackground(Color.RED);
				y=0;
			}
		}
		
		user_ans = 4;	
	}
	
	public void NextActionPerformed(ActionEvent e)
	{
		f.dispose();
		new frame();
	}
	
	public void DDipActionPerformed(ActionEvent e)
	{
		if(correct==1)
		{
			opt2.setEnabled(false);
			opt3.setEnabled(false);
		}
		else if(correct==2)
		{
			opt4.setEnabled(false);
			opt1.setEnabled(false);
		}
		else if(correct==3)
		{
			opt2.setEnabled(false);
			opt4.setEnabled(false);
		}
		else if(correct==4)
		{
			opt1.setEnabled(false);
			opt2.setEnabled(false);
		}
		
		d_dip.setEnabled(false);
		f_50.setEnabled(false);
		flip.setEnabled(false);
		z=1;
		if(n==9)
			f_50.setEnabled(false);
	}
	
	public void F50ActionPerformed(ActionEvent e)
	{
		y=1;
		d_dip.setEnabled(false);
		f_50.setEnabled(false);
		quit.setEnabled(false);
		flip.setEnabled(false);
		k=1;
	}
	
	public void quitActionPerformed(ActionEvent e)
	{
		x=0;
		y=0;
		z=0;
		k=0;
		l=0;
		
		String m = prize[n-1];
		n=0;
		String s = MessageFormat.format("Prize won: {0}, Thank You for playing!! ", m);
		
		JOptionPane.showMessageDialog(f, s);
		f.dispose();
		new Main2();
	}
	
	public void flipActionPerformed(ActionEvent e)
	{	l=1;
		n--;
		f.dispose();
		u=1;
		new frame();
		flip.setEnabled(false);
	}
	
	@SuppressWarnings("restriction")
	public static void playAudio(String filename)

	{

	InputStream in = null;

	AudioStream as = null;

	try

	{

	//create audio data source

	in = new FileInputStream(filename);

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
	
	public frame()
	{	
		timer = new Timer(20000, new ActionListener(){      
            public void actionPerformed(ActionEvent e) {
            	String s = MessageFormat.format("Your time has elapsed...Money won: Rs. {0}, Thank You for playing!! ", m_won);
            	JOptionPane.showMessageDialog(f,s);
            	x=0;
				y=0;
				z=0;
				k=0;
				l=0;
				n=0;
            	new Main2();
            	f.dispose();
           timer.stop();
            }
        });

		f = new JFrame("KBC");
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("D:\\kbc_img.jpg"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		Image dimg = img.getScaledInstance(1800, 1200, Image.SCALE_SMOOTH);
		ImageIcon imageicon = new ImageIcon(dimg);
		f.setContentPane(new JLabel(imageicon));
		
		
		head = new JLabel();
		q = new JTextField();
		dis = new JTextField();
		
		opt1 = new JButton("A");
		opt2 = new JButton("B");
		opt3 = new JButton("C");
		opt4 = new JButton("D");
		next = new JButton("Next");
		d_dip = new JButton("50:50");
		f_50 = new JButton("DD");
		quit = new JButton("QUIT");
		time=new JButton("Timer");
		a = new JButton("Random");
		flip = new JButton("Flip");
		
		head.setBounds(150,110,250,100);
		opt1.setBounds(150,320,250,50);
		opt2.setBounds(150,380,250,50);
		opt3.setBounds(400, 320, 250, 50);
		opt4.setBounds(400,380,250,50);
		next.setBounds(400,550,100,50);
		quit.setBounds(100,550,65,65);
		q.setBounds(50,250,800,50);
		dis.setBounds(50, 450, 800, 50);
		d_dip.setBounds(500,175,70,50);
		f_50.setBounds(600,175,50,50);
		flip.setBounds(700, 175, 70, 50);
		time.setBounds(300,500,100,50);
		a.setBounds(100,600,100,50);
		d_dip.setVisible(true);
		
		f.add(head);
		f.add(opt1);
		f.add(opt2);
		f.add(opt3);
		f.add(opt4);
		f.add(q);
		f.add(dis);
		f.add(next);
		f.add(d_dip);
		f.add(f_50);
		f.add(quit);
		f.add(flip);
		f.add(time);
		f.add(a);
		a.setVisible(false);
		
		f.setVisible(true);
		f.setLayout(null);
		f.setBackground(Color.BLUE);
		f.setSize(1800, 1200);
		q.setVisible(true);
		q.setBackground(Color.WHITE);
		q.setText("");
		dis.setBackground(Color.WHITE);
		dis.setText("");
		dis.setVisible(true);
		next.setVisible(true);
		
		q.setEditable(false);
		dis.setEditable(false);
		time.setVisible(false);
		
		questions = new String[][] {{"Which state of India has maximum population?","India's current Prime minister is from which state? ","Which state in India has the largest area?","Which state in India is famous for sweet dish 'Rasgulla' ?","Which of the following states recently split into two different states?","Hitler's party which came into power in 1933 was known as","What is the Silicon Valley of India?","What is the smallest state in India?"},
			{"Which of the folowing Indian movies has received an Oscar nomination?","Which movie is the song 'Senorita' from?","Who was the actor who potrayed Sanjay Dutt in his biopic,'Sanju'?","Which famous Bollywood actress passed away in Feb 2018?","Which of the folowing superstars is worshipped like God in his home state?","Which state is the famous RJ Danish Sait from?","Which film won the the best picture of the Oscars this year?","Who was the lead actor in the movie 'Taare Zameen Par'?"},
			{"What is the capital city of Brasil?","What is the capital city of Vietnam?","What is the capital city of Afghanisthan?","What is the capital city of Pakistan?","What is the capital city of Germany?","What is the capital of USA?","What is the capital of Switzerland?","What is the capital of Australia?"},
			{"Which country won the 2010 FIFA football World Cup?","Who won the 2007 cricket T20 World Cup?","Which Indian shooter won Olympic Bronze medal in 2012?","Where was the Olympics held in 2008?","Deepika Pallikal, an Indian squash player has married which of the following Indian cricketers?","Which country won the first Cricket World cup?","Which country won the first football World Cup?","Usain Bolt set the world record by running 100m in?"},
			{"Who was the first Non Congress Prime Minister of India?","Who was the first Vice President of India?","Who is the present Home minister of India?","Who is the current CM of Tamil Nadu?","Who is the only Indian PM who has had 2 tenures of only 13 days each?","Dr. Zakir Hussain was the?","How are the members of Rajya Sabha elected?","Members of the Rajya Sabha are elected for a term of how many years?"},
			{"What is the recently changed name of Allahabad?","Which city in India is called the city of prime ministers?","What is the White city of India?","What has the name of Faizabad been changed to?","What is the Evergreen city of India?","What is the Golden city of India?","What is the diamond city of India?","Which Indian city is nicknamed 'Mini Bombay'"},
			{"Which scientist explained Photoelectric Effect?","Who discovered first that the Sun was centre of solar system, not earth?","Higg's Bozon is also called as?","At which among the following temperatures will water have the highest density?","Who discovered Radioactivity?","What does a Fathometer measure?","Which metal is used to galvanise Iron?","What is the full form of TNT?"},
			{"In the Indian Epic Mahabharata, who washed draupadi's hair with the blood of Dushasana?","With the disintegration of USSR in end 1991, comprised of how many Union Republics?","The theory of economic drain of India during British imperialism was propounded by","When is Kargil Vijay Diwas celebrated?","Who is the father of the Indian National Congress?","In the last one decade, Which one among the following sectors has attracted the highest FDI inflows into India?","East Timor, which became the 191st member of the UN, is in the continent of?","What is the largest city in Latin America?"},
			{"What is the holy book of Parsis?","The ratio of width of our National flag to its length is","Pappu Karki, the popular folk singer has passed away. He was native of which state?","India's first national police museum is to be established in which city?","What state in India has recorded the highest number of high school drop outs? ","Garampani sanctuary is located at?","The first human heart transplant operation conducted by Dr. Christiaan Barnard on Louis Washkansky, was conducted in?","Hockey was introduced in the Asian Games in?"}};
			
		options = new String[][][]{{{"A. Rajasthan","B. Uttar Pradesh","C. West Bengal","D. Maharashtra"},{"A. Gujarat","B. Uttar Pradesh","C. Rajasthan","D. Maharashtra"},{"A. Rajasthan","B. Uttar Pradesh","C. Jammu and Kashmir","D. Maharashtra"},{"A. Gujarat","B. Karnataka","C. West Bengal","D. Maharashtra"},{"A. Karnataka","B. Uttar Pradesh","C. West Bengal","D. Andhra Pradesh"},{"A. Labour Party","B. Nazi party","C. Ku - Klux - Klan","D. Democratic party"},{"A. Bangalore","B. Delhi","C. Mumbai","D. Pune"},{"A. Tripura","B. Mizoram","C. Sikkim","D. Goa"}},
			{{"A. Maachis","B. Mother India","C. Newton","D. Jab we met"},{"A. Zindagi na milegi dobara","B. Rockstar","C. Student of the year","D. Highway"},{"A. Ranveer Singh","B. Hrithik Roshan","C. Ranbir Kapoor","D. Saif Ali Khan"},{"A. Madhuri Dixit","B. Jaya Bachchan","C. Paravin Babi","D. Sridevi"},{"A. Rajnikant","B. Amitabh Bachchan","C. Puneeth Rajkumar","D. Prabhas"},{"A. West Bengal","B. Tamil Nadu","C. Karnataka","D. Gujarat"},{"A. Shape of Water","B. Dunkirk","C. Three Billboards Outside Ebbing, Missouri","D. Moonlight"},{"A. Shah Rukh Khan","B. Salman Khan","C. Aamir Khan","D. Amitabh Bachchan"}},
			{{"A. Rio de Janeiro","B. Sau paulo","C. Brasilia","D. Salvador"},{"A. Hanoi","B. Ho Chi Minh City","C. Phnomm Penn","D. Bangkok"},{"A. Islamabad","B. Kabul","C. Peshawar","D. Jalalabad"},{"A. Islamabad","B. Lahore","C. Peshawar","D. Karachi"},{"A. Munich","B. Frankfurt","C. Dusseldorf","D. Berlin"},{"A. New York","B. San Francisco","C. Washington DC","D. Seattle"},{"A. Berne","B. Geneva","C. Zermatt","D. Zurich"},{"A. Sydney","B. Canberra","C. Melbourne","D. Perth"}},
			{{"A. Spain","B. Netherlands","C. Germany","D. France"},{"A. Australia","B. Pakistan","C. India","D. West Indies"},{"A. Jitu Rai","B. Abhinav Bindra","C. Gagan Narang","D. Shardul Thakur"},{"A. London","B. Rio De Janeiro","C. Delhi","D. Beijing"},{"A. Virendar Sehwag","B. Dinesh Kartik","C. Ravindra Jadeja","D. R.Ashwin"},{"A. West Indies","B. India","C. Australia","D. England"},{"A. Argentina","B. Uruguay","C. Brazil","D. India"},{"A. 9.63 sec","B. 9.69 sec","C. 9.58 sec","D. 9.49 sec"}},
			{{"A. Morarji Desai","B. V.P Singh","C. A.B.Vajpayee","D. Jawaharlal Nehru"},{"A. Dr. Rajendra Prasad","B. Dr. S.Radhakrishnan","C. Zakir Hussain","D. V. Naidu"},{"A. Arun Jaithley","B. Smriti Irani","C. Sushma Swaraj","D. Rajnath Singh"},{"A. Jayalalitha","B. Palaniswami","C. Paneerselvam","D. Annadurai"},{"A. Lal Bahadur Shastri","B. Charan Singh","C. I.K.Gujral","D. G.Nanda"},{"A. First Muslim President of India","B. First vice president of india", "C. First deputy prime minister of India ", "D. First speaker of Lok Sabha"},{"A. By Lok Sabha","B. By Legislative assembly","C. By Legislative Council","D. By the people"},{"A. 5","B. 10","C. 6","D. 4"}},
			{{"A. Faizabad","B. Karnavati","C. Fatehpur","D. Prayagraj"},{"A. Patna","B. Lucknow","C. Allahabad","D. Nagpur"},{"A. Ahmedabad","B. Udaipur","C. Coimbatore","D. Madurai"},{"A. Ayodhya","B. Fatehpur","C. Akbarpur","D. Muzaffarnagar"},{"A. Bangalore","B. Thiruvananthapuram","C. Chennai","D. Kochi"},{"A. Jaisalmer","B. Ajmer","C. Bikaner","D. Amritsar"},{"A. Mumbai","B. Surat","C. Bangalore","D. Shimla"},{"A. Nagpur","B. Nashik","C. Pune","D. Indore"}},
			{{"A. Michael Faraday","B. Alessandro Volta","C. Max planck","D. Albert Einstein"},{"A. Copernicus","B. Issac Newton","C. Galileo","D. Aryabhatta"},{"A. Fastest Particle","B. God's particle","C. Magic particle","D. Invisible Particle"},{"A. 100° C","B. 0° C","C. 4° C","D. -20° C"},{"A. Marie Curie","B. Pierre Curie","C. Michael Faraday","D. Henri Becquerel"},{"A. Intensity of floods","B. Rainfall", "C. Ocean depth", "D. Sound intensity"},{"A. Tin","B. Zinc","C. Lead","D. Aluminium"},{"A. Tri Nuclei Toluene","B. Tri Nuclei Torene","C. Tri Nitro Torene","D. Tri Nitro Toluene"}},
			{{"A. Arjuna","B. Duryodhana","C. Bhima","D. Krishna"}, {"A. 20", "B. 10", "C. 15", "D. 5"},{"A. Dadabai Naoroji", "B. Mahatma Gandhi", "C. Jawaharal Nehru", "D. R.C Dutta"},{"A. 21st July", "B. 21st June", "C. 26th June", "D. 26th July"},{"A. Mahatma Gandhi", "B. A.O. Hume", "C. Dadbhai Naoroji", "D. D.E. Wacha"},{"A. IT","B. Telecommunication","C. Banking","D. Industrial parks"},{"A. Asia","B. Africa", "C. Europe", "D. South America"},{"A. Mexico city","B. Caracas","C. Buenos Aires","D. Rio De Janeiro"}},
			{{"A. Torah","B. Avesta","C. Qissa-i-Sanjan","D. Pahlavi"},{"A. 3:5","B. 2:3","C. 2:4 ","D. 3:4 "},{"A. Jammu and Kashmir", "B. Himachal Pradesh", "C. Uttarakhand", "D. Punjab"},{"A. Delhi", "B. Mumbai", "C. Bangalore", "D. Chennai"},{"A. Mizoram","B. Manipur","C. Tripura","D. Nagaland"},{"A. Junagarh, Gujarat","B. Diphu, Assam","C. Kohima, Nagaland","D. Gangtok, Sikkim"},{"A. 1967","B. 1968","C. 1958","D. 1922"},{"A. 1958 in Tokyo","B. 1962 in Jakarta","C. 1966 in Bangkok","D. 1970 in Bangkok"}}};
			
		ans = new int[][]{{2,1,1,3,4,2,1,4},{2,1,3,4,1,3,1,3},{3,1,2,1,4,3,1,2},{1,3,3,4,2,1,2,3},{1,2,4,2,4,1,2,3},{4,3,2,1,2,1,2,4},{4,1,2,3,4,3,2,4},{3,3,1,4,2,2,1,1},{2,2,3,1,4,2,1,1}};
		
		prize = new String[] {"-","-","-","-","Small chocalate","1 perk","1 Dairy Milk"," a Pen","a Diary","Final trophy"};
		m_won = prize[n];
		
		if(u==1)
		{
			u=0;
			do {
				x1 = (int)(Math.random()*questions[n].length);
			}while(x1==x);
			init(x1,n);
		}
		else {
			x = (int)(Math.random()*questions[n].length);
			init(x,n);
	    }
		
		JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
		t1 = new JTextField("Warm up round 1(No prizes)");
		t2 = new JTextField("Warm up round 2(No prizes)");
		t3 = new JTextField("Safe round(No prizes)");
		t5 = new JTextField("Perk");
		t6 = new JTextField("Dairy Milk");
		t7 = new JTextField("Pen");
		t8 = new JTextField("Diary");
		t4 = new JTextField("Small chocalate");
		t9 = new JTextField("Final trophy");
		//t1.setBorder(BorderFactory.createCompoundBorder(
          //      new CustomeBorder(), 
            //    new EmptyBorder(new Insets(15, 25, 15, 25))));
		t9.setBounds(1000,150,250,70);
		t8.setBounds(1000,220,250,70);
		t7.setBounds(1000,290,250,70);
		t6.setBounds(1000,360,250,70);
		t5.setBounds(1000,430,250,70);
		t4.setBounds(1000,500,250,70);
		t3.setBounds(1000,570,250,70);
		t2.setBounds(1000,640,250,70);
		t1.setBounds(1000,710,250,70);
		
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t7);
		f.add(t8);
		f.add(t9);
		
		t1.setEditable(false);
		t2.setEditable(false);
		t3.setEditable(false);
		t4.setEditable(false);
		t5.setEditable(false);
		t6.setEditable(false);
		t7.setEditable(false);
		t8.setEditable(false);
		t9.setEditable(false);
		
		t1.setBackground(Color.white);
		t2.setBackground(Color.white);
		t3.setBackground(Color.white);
		t4.setBackground(Color.white);
		t5.setBackground(Color.white);
		t6.setBackground(Color.white);
		t7.setBackground(Color.WHITE);
		t8.setBackground(Color.WHITE);
		t9.setBackground(Color.WHITE);
		
		if(n==0)
			t1.setBackground(Color.ORANGE);
		
		if(n==1)	
		{	t1.setBackground(Color.GREEN);
			t2.setBackground(Color.ORANGE);	
		}
		
		if(n==2)
		{	t1.setBackground(Color.GREEN);	
			t2.setBackground(Color.GREEN);
			t3.setBackground(Color.ORANGE);   }
		
		if(n==3)	
		{	t1.setBackground(Color.GREEN);	
			t2.setBackground(Color.GREEN);	
			t3.setBackground(Color.GREEN);
			t4.setBackground(Color.ORANGE);
		}
			
		if(n==4)
		{
			t1.setBackground(Color.GREEN);	
			t2.setBackground(Color.GREEN);	
			t3.setBackground(Color.GREEN);	
			t4.setBackground(Color.GREEN);
			t5.setBackground(Color.ORANGE);
		}
			
		if(n==5)
		{
			t1.setBackground(Color.GREEN);	
			t2.setBackground(Color.GREEN);	
			t3.setBackground(Color.GREEN);	
			t4.setBackground(Color.GREEN);	
			t5.setBackground(Color.GREEN);
			t6.setBackground(Color.ORANGE);	
		}
		
		if(n==6)
		{
			t1.setBackground(Color.GREEN);	
			t2.setBackground(Color.GREEN);	
			t3.setBackground(Color.GREEN);	
			t4.setBackground(Color.GREEN);	
			t5.setBackground(Color.GREEN);	
			t6.setBackground(Color.GREEN);
			t7.setBackground(Color.ORANGE); 
		}
		
		if(n==7)
		{
			t1.setBackground(Color.GREEN);	
			t2.setBackground(Color.GREEN);	
			t3.setBackground(Color.GREEN);	
			t4.setBackground(Color.GREEN);	
			t5.setBackground(Color.GREEN);	
			t6.setBackground(Color.GREEN);
			t7.setBackground(Color.GREEN);
			t8.setBackground(Color.ORANGE);
		}
		
		if(n==8)
		{
			t1.setBackground(Color.GREEN);	
			t2.setBackground(Color.GREEN);	
			t3.setBackground(Color.GREEN);	
			t4.setBackground(Color.GREEN);	
			t5.setBackground(Color.GREEN);	
			t6.setBackground(Color.GREEN);
			t7.setBackground(Color.GREEN);
			t8.setBackground(Color.GREEN);
			t9.setBackground(Color.ORANGE);
		}
		
		if(n==9)
		{
			t1.setBackground(Color.GREEN);	
			t2.setBackground(Color.GREEN);	
			t3.setBackground(Color.GREEN);	
			t4.setBackground(Color.GREEN);	
			t5.setBackground(Color.GREEN);	
			t6.setBackground(Color.GREEN);
			t7.setBackground(Color.GREEN);
			t8.setBackground(Color.GREEN);
			t9.setBackground(Color.GREEN);
		}
		
		
		n++;
	}
	
	public void init(int m,int n){
	
	opt1.setEnabled(true);
	opt2.setEnabled(true);
	opt3.setEnabled(true);
	opt4.setEnabled(true);
	quit.setEnabled(true);
	
	if(z==0)
		d_dip.setEnabled(true);
	else
		d_dip.setEnabled(false);
	
	if(k==0)
		f_50.setEnabled(true);
	else
		f_50.setEnabled(false);
	
	if(l==0)
		if(n<8)
			flip.setEnabled(true);
		else 
			flip.setEnabled(false);
	else
		flip.setEnabled(false);

	opt1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	timer.stop();
               opt1ActionPerformed(e);
        }
});
	
	opt2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	timer.stop();  
        	opt2ActionPerformed(e);
        }
});
	
	opt3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	timer.stop();
               opt3ActionPerformed(e);
        }
});
	
	opt4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	timer.stop();
               opt4ActionPerformed(e);
        }
}); 
	next.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	   timer.stop();  
        	NextActionPerformed(e);
            
        }
}); 
	d_dip.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	timer.stop();
               DDipActionPerformed(e);
        }
}); 
	f_50.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	timer.stop();
               F50ActionPerformed(e);
        }
}); 
	
	quit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	timer.stop();
               quitActionPerformed(e);
        }
}); 
	
	flip.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	timer.stop();
               flipActionPerformed(e);
        }
}); 
    time.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            for(int y=0;y<1;y++)     
        	timer.start();              // start timer
        }
    });

         
        
	q.setText(questions[n][m]);
	opt1.setText(options[n][m][0]);
	opt2.setText(options[n][m][1]);
	opt3.setText(options[n][m][2]);
	opt4.setText(options[n][m][3]);
	correct = ans[n][m];
	next.setEnabled(false);
	
	if(n>=4)
	{
		m_won = prize[4];
	}
	if(n==8)
	{
		
		d_dip.setEnabled(false);
		f_50.setEnabled(false);
	}
	if(n==3)
		JOptionPane.showMessageDialog(f, "You have just crossed your safe limit...any wrong answer now will result in winning of only a small chocalate!!!");
	}
	
	public static void main(String args[]){
		new Main2();  
	}
	
}
