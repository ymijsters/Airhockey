package game;

import java.awt.Color;
import java.awt.Dimension;

public class Game {
	//Player 1 variable
	private Player player1;
	//Player 2 variable
	private Player player2;
	//board variable
	private Dimension boardsize;
	//puck variable
	private Puck puck;
	private Game(){
		init();
	}
	public void init(){
		player1 = new Player("Thomas");
		player2 = new Player("Yannick");
		puck = new Puck(Color.black,6,boardsize);
		

	}
	
}
