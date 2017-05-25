import javax.swing.JPanel;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JButton;

import java.awt.GridBagConstraints;

import javax.swing.BoxLayout;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.Insets;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import net.miginfocom.swing.MigLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.Timer;

import java.awt.Component;

import javax.swing.Box;

import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.SwingConstants;


public class gui extends JPanel {

	/**
	 * Create the panel.
	 */
	private Timer timer;
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
    private Updater update;
    //private Container container;
	public gui(){
		////////////////////////////
		GroupLayout groupLayout = new GroupLayout(this);
		update = new Updater();
        ClassLoader clder= this.getClass().getClassLoader();
		ImageIcon u1 = new ImageIcon(clder.getResource("unit1.jpg"));
        ImageIcon u2 = new ImageIcon(clder.getResource("u2.jpg"));
        ImageIcon u3 = new ImageIcon(clder.getResource("u3.jpg"));
        u11=u1.getImage();
        u22=u2.getImage();
        u33=u3.getImage();
        ////////////////////////////
        //setDefaultCloseOperation(System.exit(0));
        ////////////////////////////
		setBackground(SystemColor.activeCaptionText);
		
		JButton btnStartGame = new JButton("Start Game");
		
		JButton button = new JButton("6");//6
		
		JButton button_1 = new JButton("Uni444t");//5
		
		JButton button_2 = new JButton("Unit3333");//4
		
		JButton button_3 = new JButton("U3333223423nit");//3
		
		JButton button_4 = new JButton(u2);//2
		
		JButton button_5 = new JButton(u1);//1
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == btnStartGame)
				{
					groupLayout.removeLayoutComponent(btnStartGame);
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
						/*
						//update health of base and resources
						container.remove(H);
						container.remove(R);
						H = new JLabel("Health: " + update.getPlayerHealth() + "/500");
					    R = new JLabel("Resource: "+ update.getResource());
					    container.add(R,0,6);
				    	container.add(H,0,0);
					    //runner update should return array for gui to change unit loca ??
					*/}
				};
				timer = new javax.swing.Timer(1000, taskPreformer);
					
					timer.start();// timer starts here
				}
			}
		});
		
		JButton button_6 = new JButton("Unit");//7
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblUnits = new JLabel("Units");
		
		JTextArea txtrHealth = new JTextArea();
		txtrHealth.setText("Health:");
		
		JTextArea txtrResource = new JTextArea();
		txtrResource.setText("Resource:");
		
		JLabel label_1 = new JLabel("10");
		
		JLabel label_2 = new JLabel("30");
		
		JLabel label_3 = new JLabel("50");
		
		JLabel label_4 = new JLabel("75");
		
		JLabel label_5 = new JLabel("100");
		
		JLabel label_6 = new JLabel("150");
		
		JLabel label_7 = new JLabel("200");
		
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblUnits, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
									.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtrHealth, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(btnStartGame, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtrResource, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(113)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(84)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(82)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(84)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(82)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(81)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(87)
							.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrHealth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrResource, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(408)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_1)
								.addComponent(label_5)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_6)
									.addComponent(label_7))))
						.addComponent(label_2)
						.addComponent(label_3)
						.addComponent(label_4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblUnits, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnStartGame, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
					.addGap(20))
		);
		setSize(900,550);
		setLayout(groupLayout);

	}
}
