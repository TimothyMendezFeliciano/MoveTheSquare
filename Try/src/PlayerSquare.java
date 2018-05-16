import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class PlayerSquare extends Square {

	public PlayerSquare(int xPos, int yPos, int height, int width) {
		super(xPos, yPos, height, width);
	}

	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		Rectangle playerBlock = new Rectangle(getxPos(), getyPos(), getHeight(), getWidth());

		g2.setColor(Color.BLUE);
		g2.fill(playerBlock);
		g2.draw(playerBlock);
	}
	public void translate(InputHandler i) {
		
		if(i.isDownPressed()) {
			this.setyPos(getyPos() + 25);
		}
		if(i.isLeftPressed()) {
			this.setxPos(getxPos() - 25);
		}
		if(i.isRightPressed()) {
			this.setxPos(getxPos() + 25);
		}
		if(i.isUpPressed()) {
			this.setyPos(getyPos() - 25);
		}

	}

}
