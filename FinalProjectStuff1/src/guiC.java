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
    public guiC()
    {
    	super("MLG StickFight");
    	Container container = getContentPane();
        container.setLayout( new GridLayout(5,9) );
    	
    	unit1 = new JButton("fish.gif");
    	buttonArray = new JButton[8];
    	//ButtonHandler buttonHandler = new ButtonHandler();
    	// STEP 4: add unit JButtons
    	for(int a=1; a<8;a++)
    	{
    		buttonArray[a]= new JButton();
    		container.add(buttonArray[a]);
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
    	// Timer
    	
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
					RunnerClass.update(a);
			}
			if(event.getSource() == startButton)
			{// construction a Swing timer that goes off every 1000 msec (1 sec)
				timer = new javax.swing.Timer(1000, this);
				timer.start();// timer starts here
			}
			}
		}
	}		
        
