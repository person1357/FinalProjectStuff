import java.awt.*;          // access to Container
import java.awt.event.*;    // access to WindowAdapter, WindowEvent

import javax.swing.*;       // access to JFrame and JComponents
import javax.swing.Timer;

import java.util.*;

public class guiC extends JFrame{
    final long serialVersionUID = 1L;
	private JButton startButton;
    private JButton[] buttonArray;
    private Timer timer;
    private JLabel H;
    private JLabel R;
    private Updater update;
    private Container container;
    private ArrayList<Integer> pAry;
    private ArrayList<Integer> eAry;
    private Image u11;
    private Image u22;
    private Image u33;
    private Image u44;
    private Image u55;
    private Image u66;
    private Image u77;
    private Image u88;
    private Image background;
    public guiC()
    {
    	super("MLG StickFight");
    	container = getcontainer();
        container.setLayout( (LayoutManager) new JPanel() );
        update = new Updater();
        ClassLoader clder= this.getClass().getClassLoader();
        ImageIcon u1 = new ImageIcon(clder.getResource("u1.jpg"));
        ImageIcon u2 = new ImageIcon(clder.getResource("u2.jpg"));
        ImageIcon u3 = new ImageIcon(clder.getResource("u3.jpg"));
        //ImageIcon u4 = new ImageIcon(clder.getResource("u4.jpg"));
        //ImageIcon u5 = new ImageIcon(clder.getResource("u5.jpg"));
        //ImageIcon u6 = new ImageIcon(clder.getResource("u6.jpg"));
        //ImageIcon u7 = new ImageIcon(clder.getResource("u7.jpg"));
        //ImageIcon u8 = new ImageIcon(clder.getResource("u8.jpg"));
        //ImageIcon back = new ImageIcon(clder.getResource("background.jpg"));
        u11=u1.getImage();
        u22=u2.getImage();
        u33=u3.getImage();
        //u44=u4.getImage();
        //u55=u5.getImage();
        //u66=u6.getImage();
        //u77=u7.getImage();
        //u88=u8.getImage();
        //background=back.getImage();
	//add health and resource to the container
        H = new JLabel("Health: 500/500");
        R = new JLabel("Resource: 0");
    	container.add(R);
    	container.add(H);

    	buttonArray = new JButton[8];
    	//ButtonHandler buttonHandler = new ButtonHandler();
    	// STEP 4: add unit JButtons
    	buttonArray[0] = new JButton(u1);
    	buttonArray[1] = new JButton(u2);
    	buttonArray[2] = new JButton(u3);
    	//buttonArray[3] = new JButton(u4);
    	///buttonArray[4] = new JButton(u5);
    	//buttonArray[5] = new JButton(u6);
    	//buttonArray[6] = new JButton(u7);
    	container.add(buttonArray[0]);
    	buttonArray[0].addActionListener(new ButtonHandler());
    	container.add(buttonArray[1]);
    	buttonArray[1].addActionListener(new ButtonHandler());
    	container.add(buttonArray[2]);
    	buttonArray[2].addActionListener(new ButtonHandler());
    	
    		////////////////////////////////////////
    	
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
    /////////////////////////////////////////////////////////
    {
        // call superclass paint method
        super.paint(g);
        g.drawImage(background,1600,200,this);
        for(int p=0; p<pAry.size(); p++)
    	{
    		if(pAry.get(p)==1)
    			g.drawImage(u11,1500,300,this);
    		else if(pAry.get(p)==2)
    			g.drawImage(u22,1500,300,this);
    		else if(pAry.get(p)==3)
    			g.drawImage(u33,1500,300,this);
    		else if(pAry.get(p)==4)
    			g.drawImage(u44,1500,300,this);
    		else if(pAry.get(p)==5)
    			g.drawImage(u55,1500,300,this);
    		else if(pAry.get(p)==6)
    			g.drawImage(u66,1500,300,this);
    		else if(pAry.get(p)==7)
    			g.drawImage(u77,1500,300,this);
    	}
    	for(int p=0; p<eAry.size(); p++)
    	{
    		if(eAry.get(p)==1)
    			g.drawImage(u11,1500,700,Color.red,this);
    		else if(eAry.get(p)==2)
    			g.drawImage(u22,1500,700,Color.red,this);
    		else if(eAry.get(p)==3)
    			g.drawImage(u33,1500,700,Color.red,this);
    		else if(eAry.get(p)==4)
    			g.drawImage(u44,1500,700,Color.red,this);
    		else if(eAry.get(p)==5)
    			g.drawImage(u55,1500,700,Color.red,this);
    		else if(eAry.get(p)==6)
    			g.drawImage(u66,1500,700,Color.red,this);
    		else if(eAry.get(p)==7)
    			g.drawImage(u77,1500,700,Color.red,this);
    		else if(eAry.get(p)==8)
    			g.drawImage(u88,1500,700,Color.red,this);
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
						pAry=update.getPlayerUnitArray();
						eAry=update.getEnemyUnitArray();
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
        
