import java.awt.Graphics;
import javax.swing.JComponent;

public class Square {
	private int xPos;
	private int yPos;
	private int height;
	private int width;
	
	public Square(int xPos, int yPos, int height, int width) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.height = height;
		this.width = width;
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

	public void draw(Graphics g) {
		
	}
	public void translate(InputHandler i) {//Do me next
		
	}
	public void collide(Square[] blocks) {// Me too
		
	}
}
