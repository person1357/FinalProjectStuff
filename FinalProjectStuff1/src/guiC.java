import java.awt.*;          // access to Container
import java.awt.event.*;    // access to WindowAdapter, WindowEvent

import javax.swing.*;       // access to JFrame and JComponents
import javax.swing.Timer;
import javax.swing.event.*;     // access to JSlider events

import java.util.*;

public class guiC extends JFrame{
    private JButton startButton;
    private JButton unit1;
    private JButton unit2;
    private JButton unit3;
    private JButton unit4;
    private JButton unit5;
    private JButton unit6;
    private JButton unit7;
    private JButton[] buttonArray;
    private Timer timer;
    private int Base;
    private int Resources;
    private JLabel H;
    private JLabel R;
    private Updater update;
    public guiC()
    {
    	super("MLG StickFight");
    	Container container = getContentPane();
        container.setLayout( new GridLayout(5,9) );
        update = new Updater();
	//add health and resource to the container
        H = new JLabel("Health:");
        R = new JLabel("Resource:");
    	Base = 100;
    	Resources = 0;
    	container.add(R,0,6);
    	container.add(H,0,0);
    	wefoajewofjaoiefjaoiejfwoai;fj
    	
    	unit1 = new JButton("fish.gif");
    	buttonArray = new JButton[8];
    	//ButtonHandler buttonHandler = new ButtonHandler();
    	// STEP 4: add unit JButtons
    	for(int a=0; a<7;a++)
    	{
    		buttonArray[a]= new JButton();
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
        setSize(1000,1800);
        setVisible(true);
        
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
						//runner update should return array for gui to change unit loca ??
					}
				};
				timer = new javax.swing.Timer(1000, taskPreformer);
					
					timer.start();// timer starts here
				}
			}
	}
		
	
	}		
        
