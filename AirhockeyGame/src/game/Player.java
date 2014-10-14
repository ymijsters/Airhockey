package game;

public class Player {
	String name;
	public Player(String nameArg){
		this.name=nameArg;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String nameArg){
		this.name=nameArg;
	}
}
