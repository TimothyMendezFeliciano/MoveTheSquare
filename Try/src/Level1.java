import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class Level1 extends JComponent {

	private int amount;
	private Square[] blocks;
	private Random rand = new Random();
	private int size = 25;
	private InputHandler input = new InputHandler();

	public Level1(int amount) {
		this.amount = amount;
	}

	public void initStage() {
		
		
		blocks = new Square[amount];
		int xGoal = (rand.nextInt(32)+1)*size - size;
		int yGoal = (rand.nextInt(24)+1)*size - size;

		blocks[0] = new PlayerSquare(0,0,size,size);

		for(int i = 1; i < blocks.length; i++) {
			
			int x = (rand.nextInt(30)+1)*size;
			int y = (rand.nextInt(22)+1)*size;
				
				blocks[i] = new BlockSquare(x, y, 50, 50);
		}
		blocks[amount - 1] = new Goal(xGoal, yGoal, size, size );
		victory();
	}
	public void paintComponent(Graphics g) {

		for(int i = 0;i < blocks.length; i++) {
			if (blocks[i] == null) {
				System.out.println("Null i" + i);
				continue;
			}
			blocks[i].draw(g);			
		}
		blocks[0].translate(input);
		blocks[0].setDirection();
	}
	public void victory() {
		if(blocks[amount - 1].checkWin(blocks[0])) {
			JOptionPane.showMessageDialog(null,"Congratulations! You Won.","Congrats!!!",JOptionPane.PLAIN_MESSAGE);
		}
	}

}
