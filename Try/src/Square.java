import java.awt.Graphics;
import javax.swing.JComponent;

public class Square {
	private int xPos;
	private int yPos;
	private int height;
	private int width;
	private int directionX = 1;
	private int directionY = 1;

	public Square(int xPos, int yPos, int height, int width) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.height = height;
		this.width = width;
		this.directionX = 1;
		this.directionY = 1;
	}

	public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	public int getyPos() {
		return yPos;
	}
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDirectionX() {
		return directionX;
	}
	public void setDirectionX(int directionX) {
		this.directionX = directionX;
	}
	public int getDirectionY() {
		return directionY;
	}
	public void setDirectionY(int directionY) {
		this.directionY = directionY;
	}
	public void draw(Graphics g) {

	}
	public void translate(int deltax, int deltay) {

	}
	public void collide() {

	}
	public void setDirection() {
		
	}
	public boolean checkWin(Square p) {
		return false;
	}

}
