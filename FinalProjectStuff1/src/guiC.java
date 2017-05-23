import java.awt.*;          // access to Container
import java.awt.event.*;    // access to WindowAdapter, WindowEvent

import javax.swing.*;       // access to JFrame and JComponents
import javax.swing.Timer;
import javax.swing.event.*;     // access to JSlider events

import java.util.*;

public class guiC extends JFrame{
    private JButton startButton;
    private JButton unit8;
    private JButton[] buttonArray;
    private Timer timer;
    private JLabel H;
    private JLabel R;
    private JLabel background;
    private Updater update;
    private Container container;
    private ArrayList<Integer> pAry;
    private ArrayList<Integer> eAry;
    private ImageIcon u1;
    private ImageIcon u2;
    private ImageIcon u3;
    private ImageIcon u4;
    private ImageIcon u5;
    private ImageIcon u6;
    private ImageIcon u7;
    private ImageIcon u8;
    private ImageIcon back;
    public guiC()
    {
    	super("MLG StickFight");
    	container = getContentPane();
        container.setLayout( new GridLayout(5,9) );
        update = new Updater();
        ClassLoader clder= this.getClass().getClassLoader();
        u1 = new ImageIcon(clder.getResource("u1.jpg"));
        u2 = new ImageIcon(clder.getResource("u2.jpg"));
        u3 = new ImageIcon(clder.getResource("u3.jpg"));
        u4 = new ImageIcon(clder.getResource("u4.jpg"));
        u5 = new ImageIcon(clder.getResource("u5.jpg"));
        u6 = new ImageIcon(clder.getResource("u6.jpg"));
        u7 = new ImageIcon(clder.getResource("u7.jpg"));
        u8 = new ImageIcon(clder.getResource("u8.jpg"));
        back = new ImageIcon(clder.getResource("background.jpg"));
	//add health and resource to the container
        H = new JLabel("Health: 500/500");
        R = new JLabel("Resource: 0");
    	container.add(R,0,6);
    	container.add(H,0,0);

    	buttonArray = new JButton[8];
    	//ButtonHandler buttonHandler = new ButtonHandler();
    	// STEP 4: add unit JButtons
    	buttonArray[0] = new JButton(u1);
    	buttonArray[1] = new JButton(u2);
    	buttonArray[2] = new JButton(u3);
    	buttonArray[3] = new JButton(u4);
    	buttonArray[4] = new JButton(u5);
    	buttonArray[5] = new JButton(u6);
    	buttonArray[6] = new JButton(u7);
    	for(int a=0; a<7;a++)
    	{
    		container.add(buttonArray[a],4,a);
    		buttonArray[a].addActionListener(new ButtonHandler());
    	}
    	startButton = new JButton("Start Game");
    	container.add(startButton);
    	startButton.addActionListener(new ButtonHandler());
    	// STEP 5: set default close operation
    	addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
    	// STEP 6: set window size and show window
        setSize(1800,1000);
        setVisible(true);
        
    }
    public void paint (Graphics g )
    {
        // call superclass paint method
        super.paint(g);
        
        for(Integer p: pAry)
    	{
    		
    	}
    	for(Integer e: eAry)
    	{
    		
    	}
    }
    
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			for(int a=1; a<8;a++)
			{
				if(event.getSource() == buttonArray[a])
					update.createUnit(a);
					
			}
			if(event.getSource() == startButton)
				{
					// construction a Swing timer that goes off every 1000 msec (1 sec)
				ActionListener taskPreformer= new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						//update every second
						update.update();
						pAry=update.getPlayerArray();
						eAry=update.getEnemyArray();
						repaint();
						//check win
						int win= update.checkWin();
						if(win==2)
						{
							timer.stop();
							System.out.println("You Win");
						}
						if(win==1)
						{
							timer.stop();
							System.out.println("You Lose");
						}
						//update health of base and resources
						container.remove(H);
						container.remove(R);
						H = new JLabel("Health: " + update.getPlayerHealth() + "/500");
					    R = new JLabel("Resource: "+ update.getResource());
					    container.add(R,0,6);
				    	container.add(H,0,0);
					    //runner update should return array for gui to change unit loca ??
					}
				};
				timer = new javax.swing.Timer(1000, taskPreformer);
					
					timer.start();// timer starts here
				}
			}
	}
	}		
        
