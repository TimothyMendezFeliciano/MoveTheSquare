
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Move That Square");
		frame.setSize(1000, 700);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Level1 level = new Level1(10);
		frame.add(level);
		level.initStage();
		
		while(true) {
			frame.repaint();
			Thread.sleep(50);
		}

	}

}
