package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class StartGui extends JPanel implements ActionListener {

//-----------------------------------------------------------------------//
	
	private static final long serialVersionUID = 2294551299848220328L;
	private JLabel title;
	private JButton start;
	private JButton quit;
	private JLabel yannick;
	private JLabel thomas;
	private JLabel nathan;
	private JLabel arnold;
	private JLabel witregel;
	private JFrame starter;
	private JPanel titlePanel;
	private JPanel centerPanel;
	private JPanel namePanel;
	private BorderLayout layout;
	
//-----------------------------------------------------------------------//
	

	public StartGui() {
		starter = new JFrame("Chatser");
		layout = new BorderLayout();
		starter.setLayout(layout);
		starter.add(northTitle(), BorderLayout.NORTH);
		starter.add(centerSQ(), BorderLayout.CENTER);
		starter.add(names(), BorderLayout.SOUTH);
		starter.setVisible(true);
		starter.setResizable(false);
		starter.setSize(400, 300);
		starter.setLocationRelativeTo(null);
		starter.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	private JPanel northTitle() {
		title = new JLabel("<html> <font color='white'>CHATSER</font></html>");
		Font titleFont = new Font("28 Days Later",Font.PLAIN,70);
		title.setFont(titleFont);
		titlePanel = new JPanel();
		titlePanel.setBackground(Color.BLACK);
		titlePanel.add(title);
		return titlePanel;
	}
	
	private JPanel centerSQ() {
		start = new JButton("<html> <font color='white'>START</font></html>");
		Font startFont = new Font("28 Days Later",Font.PLAIN,50);
		start.setFont(startFont);
		start.setOpaque(false);
		start.setContentAreaFilled(false);
		start.setBorderPainted(false);
		start.addActionListener(this);
		quit = new JButton("<html> <font color='white'>QUIT</font></html>");
		Font quitFont = new Font("28 Days Later",Font.PLAIN,50);
		quit.setFont(quitFont);
		quit.setOpaque(false);
		quit.setContentAreaFilled(false);
		quit.setBorderPainted(false);
		quit.addActionListener(this);
		centerPanel = new JPanel();
		centerPanel.setBackground(Color.BLACK);
		centerPanel.add(start);
		centerPanel.add(quit);
		return centerPanel;
	}
	
	private JPanel names() {
		yannick = new JLabel("<html><font color = 'black'>-------------------------------------<font color='white'>Yannick Mijsters</font></html>");
		Font groepFont = new Font("28 Days Later",Font.PLAIN,12);
		yannick.setFont(groepFont);
		thomas = new JLabel("<html><font color ='black'>-------------------------------------<font color='white'>Thomas Raaijen</font></html>");
		thomas.setFont(groepFont);
		nathan = new JLabel("<html><font color ='black'>-------------------------------------<font color='white'>Nathan Reiling</font></html>");
		nathan.setFont(groepFont);
		arnold = new JLabel("<html><font color ='black'>-------------------------------------<font color='white'>Arnold Hofstede</font></html>");
		arnold.setFont(groepFont);
		witregel = new JLabel();
		namePanel = new JPanel();
		namePanel.setLayout(new GridLayout(5,2));
		namePanel.setBackground(Color.BLACK);
		namePanel.add(yannick);
		namePanel.add(thomas);
		namePanel.add(arnold);
		namePanel.add(nathan);
		namePanel.add(witregel);
		return namePanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == start) {
			new Terms();
			starter.dispose();
		}
		
		if (arg0.getSource() == quit) {
			starter.dispose();
		}
	}
	
	public static void main(String[] args0) {
		new StartGui();
	}

}
