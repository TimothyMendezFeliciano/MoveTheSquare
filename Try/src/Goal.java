import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Goal extends Square {

	public Goal(int xPos, int yPos, int height, int width) {
		super(xPos, yPos, height, width);
	}

	public void draw(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		Rectangle goal = new Rectangle(getxPos(), getyPos(), getHeight(), getWidth());

		g2.setColor(Color.BLUE);
		g2.draw(goal);

	}
	
	public boolean checkWin(PlayerSquare p) {
		
		return (p.getxPos() == this.getxPos() && p.getyPos() == this.getyPos());
	}

}
