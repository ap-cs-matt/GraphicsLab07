import java.awt.*;
import java.applet.*;

public class GraphicsLab07_Matthew_Pearce extends Applet {

	// GraphicsLab07st.java
	// The student, starting version of the GraphicsLab07 assignment.

	public void paint(Graphics g) {
		g.drawRect(0,0,1024,768);
		drawSquare1(g, 1024, 768);
	}

	public void drawSquare1(Graphics g, int maxX, int maxY) {
		int midX = maxX / 2;
		int midY = maxY / 2;
		int startWidth = maxX / 4;
		int startHeight = maxY / 4;
		int tlX = midX - (startWidth / 2);
		int tlY = midY - (startHeight / 2);
		g.fillRect(tlX, tlY, startWidth, startHeight);

		topLeft(g,tlX,tlY);

	}

	public void topLeft(Graphics g, int maxX, int maxY) {


		int startWidth = maxX / 2;
		int startHeight = maxY / 2;
		int tlX = maxX - (startWidth);
		int tlY = maxY - (startHeight);
		g.fillRect(tlX, tlY, startWidth, startHeight);
	}

	public void topLRight(Graphics g, int maxX, int maxY) {

	}

	public void bottomLeft(Graphics g, int maxX, int maxY) {

	}

	public void bottomRight(Graphics g, int maxX, int maxY) {

	}

	public void delay(long n) {
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}

}
