package game;

public class Game {
	//Player 1 variable
	public Player player1;
	//Player 2 variable
	public Player player2;
	//board variable
	public Board board;
	//puck variable
	public Puck puck;
	public Game(){
		init();
	}
	public void init(){
		board = new Board();
		puck = new Puck();
		player1 = new Player("Thomas");
		player2 = new Player("Yannick");
	}
}
