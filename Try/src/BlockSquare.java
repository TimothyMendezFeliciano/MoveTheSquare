import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class BlockSquare extends Square {

	public BlockSquare(int xPos, int yPos, int height, int width) {
		super(xPos, yPos, height, width);
	}
	
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle block = new Rectangle(getxPos(), getyPos(), getHeight(), getWidth());
		
		g2.setColor(Color.RED);
		g2.fill(block);
		g2.draw(block);
	}
	public boolean checkCollision(PlayerSquare p) {
		Rectangle playerRec = new Rectangle(p.getxPos(), p.getyPos(), p.getHeight(), p.getWidth());
		Rectangle obstacleRec = new Rectangle(getxPos(), getyPos(), getHeight(), getWidth());
		System.out.println(playerRec.intersects(obstacleRec));
		return (playerRec.intersects(obstacleRec));
	}
}
