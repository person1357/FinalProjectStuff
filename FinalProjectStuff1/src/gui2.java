import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import java.awt.Component;

import javax.swing.JTextPane;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.awt.event.*;    // access to WindowAdapter, WindowEvent

import javax.swing.*; 

import java.awt.event.*;    // access to WindowAdapter, WindowEvent

import javax.swing.*; 

public class gui2 extends JFrame {

	private JPanel contentPane;
	private JButton SB;
	private JButton u1;
	private JButton u2;
	private JButton u3;
	private JButton u4;
	private JButton u5;
	private JButton u6;
	private JButton u7;
	private Timer timer;
	private JLabel label;
	private Updater update;
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
    private Image baseP;
    private Image baseE;
    private GroupLayout gl_contentPane;
    private JTextPane txtpnHealth;
    private JTextPane txtpnResources;
    private int r;
    private boolean b1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui2 frame = new gui2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public gui2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//
		update = new Updater();
        ClassLoader clder= this.getClass().getClassLoader();
        ImageIcon u1I = new ImageIcon(clder.getResource("unit1.jpg"));
        ImageIcon u2I = new ImageIcon(clder.getResource("u2.jpg"));
        ImageIcon u3I = new ImageIcon(clder.getResource("u3.jpg"));
        ImageIcon u4I = new ImageIcon(clder.getResource("u4.jpg"));
        ImageIcon u5I = new ImageIcon(clder.getResource("u5.jpg"));
        ImageIcon u6I = new ImageIcon(clder.getResource("u6.jpg"));
        ImageIcon u7I = new ImageIcon(clder.getResource("u7.jpg"));
        ImageIcon u8I = new ImageIcon(clder.getResource("u8.jpg"));
        ImageIcon backgroundIcon = new ImageIcon(clder.getResource("background.jpg"));
        ImageIcon basepp = new ImageIcon(clder.getResource("base1.jpg"));
        ImageIcon baseee = new ImageIcon(clder.getResource("base2.jpg"));
        u11=u1I.getImage();
        u22=u2I.getImage();
        u33=u3I.getImage();
        u44=u4I.getImage();
        u55=u5I.getImage();
        u66=u6I.getImage();
        u77=u7I.getImage();
        u88=u8I.getImage();
        background=backgroundIcon.getImage();
        baseP=basepp.getImage();
        baseE=baseee.getImage();

		//
		SB= new JButton("Start Button");
		SB.addActionListener(new ButtonHandler());
		u1 = new JButton(u1I);//1
		u1.addActionListener(new ButtonHandler());
		u2 = new JButton(u2I);//2
		u2.addActionListener(new ButtonHandler());
		u3 = new JButton(u3I);//3
		u3.addActionListener(new ButtonHandler());
		u4 = new JButton(u4I);//4
		u4.addActionListener(new ButtonHandler());
		u5 = new JButton(u5I);
		u5.addActionListener(new ButtonHandler());
		u6 = new JButton(u6I);
		u6.addActionListener(new ButtonHandler());
	    u7 = new JButton(u7I);
		u7.addActionListener(new ButtonHandler());
		txtpnResources = new JTextPane();
		txtpnResources.setText("Resources");
		
		txtpnHealth = new JTextPane();
		txtpnHealth.setText("Health");
		
		label = new JLabel("Units");
		label.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
							.addComponent(u1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(u2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(u3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtpnHealth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtpnResources, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(u4, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(u5, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(u6, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(u7, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(SB, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtpnHealth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(405)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtpnResources, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(SB, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(u7, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(u6, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(u5, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(u4, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(u3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(u2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(u1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))))))
		);

    	addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
    	// STEP 6: set window size and show window
        contentPane.setSize(1800,1000);
		contentPane.setLayout(gl_contentPane);
		contentPane.setVisible(true);
	}
	//////////////////////////////////////////////////////////////////////////////////////////////
	public void paint(Graphics g)
	{
		super.paint(g);

			g.drawImage(u11, getX(), getY(), this);
		
	}
	
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			if(event.getSource() == u1)
				{
					update.createUnit(1);
					b1 = true;
					//need a method here to paint the unit onto the screen
				}
			else if(event.getSource() == u2)
				update.createUnit(2);
			else if(event.getSource() == u3)
				update.createUnit(3);
			else if(event.getSource() == u4)
				update.createUnit(4);
			else if(event.getSource() == u5)
				update.createUnit(5);
			else if(event.getSource() == u6)
				update.createUnit(6);
			else if(event.getSource() == u7)
				update.createUnit(7);
			/////////////////////////////////////////////////////////////////////////////
			
			if(event.getSource() == SB)
			{
				//gl_contentPane.removeLayoutComponent(SB);

				ActionListener taskPreformer= new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						// construction a Swing timer that goes off every 1000 msec (1 sec)
						//update every second
						update.update();
						r=update.getResource();
						pAry=update.getPlayerUnitArray();
						eAry=update.getEnemyUnitArray();
						txtpnResources.setText("Resources:" + r);
						repaint();
						        
=======
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui2 frame = new gui2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public gui2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//
		update = new Updater();
        ClassLoader clder= this.getClass().getClassLoader();
        ImageIcon u111 = new ImageIcon(clder.getResource("unit1 (1).jpg"));
//        ImageIcon u222 = new ImageIcon(clder.getResource("u2.jpg"));
//        ImageIcon u333 = new ImageIcon(clder.getResource("u3.jpg"));

		//
		SB= new JButton("Start Button");
		SB.addActionListener(new ButtonHandler());
		u1 = new JButton(u111);//1
		ImageIcon u101 = new ImageIcon(clder.getResource("unit1 (1).jpg"));
        u11=u101.getImage();
		u1.addActionListener(new ButtonHandler());
		u2 = new JButton("u231");//2
		u2.addActionListener(new ButtonHandler());
		u3 = new JButton("u14");//3
		u3.addActionListener(new ButtonHandler());
		u4 = new JButton("21");//4
		u4.addActionListener(new ButtonHandler());
		u5 = new JButton("24u1");
		u5.addActionListener(new ButtonHandler());
		u6 = new JButton("u124");
		u6.addActionListener(new ButtonHandler());
	    u7 = new JButton("u241");
		u7.addActionListener(new ButtonHandler());
		txtpnResources = new JTextPane();
		txtpnResources.setText("Resources");
		
		txtpnHealth = new JTextPane();
		txtpnHealth.setText("Health");
		
		label = new JLabel("Units");
		label.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
							.addComponent(u1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(u2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(u3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtpnHealth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtpnResources, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(u4, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(u5, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(u6, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(u7, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(SB, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtpnHealth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(405)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtpnResources, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(SB, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(u7, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(u6, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(u5, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(u4, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(u3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(u2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(u1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))))))
		);

    	addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
    	// STEP 6: set window size and show window
        contentPane.setSize(1800,1000);
		contentPane.setLayout(gl_contentPane);
		contentPane.setVisible(true);
	}
	//////////////////////////////////////////////////////////////////////////////////////////////
	public void paint(Graphics g)
	{
		super.paint(g);
		
	}
	
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			if(event.getSource() == u1)
				{
					update.createUnit(1);
					
					//need a method here to paint the unit onto the screen
				}
			else if(event.getSource() == u2)
				update.createUnit(2);
			else if(event.getSource() == u3)
				update.createUnit(3);
			else if(event.getSource() == u4)
				update.createUnit(4);
			else if(event.getSource() == u5)
				update.createUnit(5);
			else if(event.getSource() == u6)
				update.createUnit(6);
			else if(event.getSource() == u7)
				update.createUnit(7);
			/////////////////////////////////////////////////////////////////////////////
			if(event.getSource() == SB)
			{
				//gl_contentPane.removeLayoutComponent(SB);

				ActionListener taskPreformer= new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						// construction a Swing timer that goes off every 1000 msec (1 sec)
						//update every second
						update.update();
						r=update.getResource();
						pAry=update.getPlayerUnitArray();
						eAry=update.getEnemyUnitArray();
						txtpnResources.setText("Resources:" + r);
>>>>>>> branch 'master' of https://github.com/person1357/FinalProjectStuff
						//check win
						int win= update.checkWin();
						if(win==2)
						{
							timer.stop();
							JOptionPane.showMessageDialog(contentPane, "You Win");
							System.exit(0);
						}
						if(win==1)
						{
							timer.stop();
							JOptionPane.showMessageDialog(contentPane, "You Lose");
							System.exit(0);
						}
					}
				};

				timer = new javax.swing.Timer(1000, taskPreformer);
				timer.start();// timer starts here
			}
		}
	}
}
	
