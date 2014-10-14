package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Puck {
	private Color puckColor;
	private double x;
	private double y;
	private int diameter;
	private Dimension velocity;
	private Dimension boardSize;
	
	public Puck(Color color, int diameter, Dimension boardSize){
		this.puckColor=color;
		velocity = new Dimension(1,1);
		this.boardSize = boardSize; 
	}
	public void movePuck(){
		setX(x+velocity.getWidth());
		setY(y+velocity.getHeight());
		checkWallCollision();
	}
	public void setX(double xArg){
		x=xArg;
	}
	public void setY(double yArg){
		y=yArg;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public void checkWallCollision(){
		if(x==0){
			velocity.setSize(1, velocity.getHeight());
		}
		else if(x==boardSize.width){
			velocity.setSize(-1,velocity.getHeight());
		}
		if(y==0){
			velocity.setSize(velocity.getWidth(),1);
		}else if(y==boardSize.height){
			velocity.setSize(velocity.getWidth(),-1);
		}
	}
}
