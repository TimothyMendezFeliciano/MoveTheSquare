

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Handles user input events.
 */
public class InputHandler implements KeyListener {
	private boolean leftIsPressed;
	private boolean rightIsPressed;
	private boolean downIsPressed;
	private boolean upIsPressed;

	public InputHandler() {
		reset();
	}

	public void reset() {
		leftIsPressed = false;
		rightIsPressed = false;
		downIsPressed = false;
		upIsPressed = false;
	}

	public boolean isLeftPressed() {
		return leftIsPressed;
	}

	public boolean isRightPressed() {
		return rightIsPressed;
	}

	public boolean isDownPressed() {
		return downIsPressed;
	}

	public boolean isUpPressed() {
		return upIsPressed;
	}

	/**
	 * Handle a key input event.
	 */
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			this.upIsPressed = true;
			break;
		case KeyEvent.VK_S:
			this.downIsPressed = true;
			break;
		case KeyEvent.VK_A:
			this.leftIsPressed = true;
			break;
		case KeyEvent.VK_D:
			this.rightIsPressed = true;
			break;
		case KeyEvent.VK_ESCAPE:
			System.exit(1);
			break;
		}

		e.consume();
	}

	/**
	 * Handle a key release event.
	 */
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {

		case KeyEvent.VK_W:
			this.upIsPressed = false;
			break;
		case KeyEvent.VK_S:
			this.downIsPressed = false;
			break;
		case KeyEvent.VK_A:
			this.leftIsPressed = false;
			break;
		case KeyEvent.VK_D:
			this.rightIsPressed = false;
			break;

		}
		e.consume();
	}

	public void keyTyped(KeyEvent e) {
		// not used
	}

}
