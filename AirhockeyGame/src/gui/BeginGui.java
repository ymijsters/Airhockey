package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;




public class BeginGui implements ActionListener{

	
//-----------------------------------------------------------------------//	
	
	private JFrame beginFrame;
	private JPanel optionPanel;
	private JPanel comboBoxPanel;
	private BorderLayout layout;
	private JButton start;
	private JButton shutDown;
	private JComboBox<String> amountPlayers;
	private JComboBox<String> gameMode;
	private String TITLE;
	

//-----------------------------------------------------------------------//
	
	public BeginGui() {
		beginFrame();
	}
	
	private JFrame beginFrame() {
		TITLE = new String("AirHockey the Game continues");
		beginFrame = new JFrame();
		beginFrame.setTitle(TITLE);
		layout = new BorderLayout();
		beginFrame.setLayout(layout);
		beginFrame.add(options(), BorderLayout.NORTH);
		beginFrame.add(comboBoxes(), BorderLayout.CENTER);
		beginFrame.setSize(1000,400);
		beginFrame.setVisible(true);
		beginFrame.setLocationRelativeTo(null);
		beginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		return beginFrame;
	}
	
	private JPanel comboBoxes() {
		comboBoxPanel = new JPanel();
		comboBoxPanel.setBackground(Color.GREEN);
		amountPlayers = new JComboBox<String>();
		amountPlayers.setForeground(Color.BLUE);
		amountPlayers.setBackground(Color.CYAN);
		amountPlayers.addItem("Two Players");
		amountPlayers.addItem("Four Players");
		amountPlayers.addActionListener(this);
		gameMode = new JComboBox<String>();
		gameMode.setForeground(Color.BLUE);
		gameMode.setBackground(Color.CYAN);
		gameMode.addItem("Free For All");
		gameMode.addItem("Tag Team");
		gameMode.addActionListener(this);
		comboBoxPanel.add(amountPlayers);
		comboBoxPanel.add(gameMode);
		return comboBoxPanel;
	}
	
	
	private JPanel options() {
		optionPanel = new JPanel();
		optionPanel.setBackground(Color.GREEN);
		start = new JButton("START");
		start.setOpaque(false);
		start.setContentAreaFilled(false);
		start.setBorderPainted(false);
		start.addActionListener(this);
		shutDown = new JButton("SHUTDOWN");
		shutDown.setOpaque(false);
		shutDown.setContentAreaFilled(false);
		shutDown.setBorderPainted(false);
		shutDown.addActionListener(this);
		optionPanel.add(start);
		optionPanel.add(shutDown);
		return optionPanel;
	}
	
	public static void main(String[] args) {
		new BeginGui();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}