import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class PlayerSquare extends Square{
	private int directionX = 1;
	private int directionY = 1;
	private KeyEvent e;

	public PlayerSquare(int xPos, int yPos, int height, int width) {
		super(xPos, yPos, height, width);
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
		Graphics2D g2 = (Graphics2D) g;

		Rectangle playerBlock = new Rectangle(getxPos(), getyPos(), getHeight(), getWidth());

		g2.setColor(Color.BLUE);
		g2.fill(playerBlock);
		g2.draw(playerBlock);
	}
	public void translate(InputHandler input) {
		if(input.isDownPressed()) {
			setyPos(getyPos() + 25);
		}
		if(input.isUpPressed()) {
			setyPos(getyPos() - 25);
		}
		if(input.isLeftPressed()) {
			setxPos(getxPos() - 25);
		}
		if(input.isRightPressed()) {
			setxPos(getxPos() + 25);
		}
	}
	public void setDirection() {
		if(this.getxPos() < 1 || this.getxPos() > 970) {
			this.setDirectionX(this.getDirectionX()*-1);
		}
		if(this.getyPos() < 1 || this.getyPos() > 670) {
			this.setDirectionY(this.getDirectionY()*-1);
		}
	}

}
