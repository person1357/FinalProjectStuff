import java.awt.*;          // access to Container
import java.awt.event.*;    // access to WindowAdapter, WindowEvent
import javax.swing.*;       // access to JFrame and JComponents
import javax.swing.event.*;     // access to JSlider events
import java.util.*;

public class guiC extends JFrame implements ActionListener{
    private Unit myUnit;
    private JButton startButton;
    public guiC()
    {
    	myUnit = new Unit();
    	Timer timer = new javax.swing.Timer(1000, this);
    	startButton = new JButton("Start Game");
    }
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		screenOutput();
	}
}
