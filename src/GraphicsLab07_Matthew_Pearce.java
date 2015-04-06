import java.awt.*;
import java.applet.*;

public class GraphicsLab07_Matthew_Pearce extends Applet {

	// GraphicsLab07st.java
	// The student, starting version of the GraphicsLab07 assignment.

	public void paint(Graphics g) {
		g.drawRect(0, 0, 1024, 768);
		drawStart(g, 1024, 768);
	}



	public void drawStart(Graphics g, int maxX, int maxY) {
		int midX = maxX / 2;
		int midY = maxY / 2;
		int startWidth = maxX / 4;
		int startHeight = maxY / 4;
		int tlX = midX - (startWidth / 2);
		int tlY = midY - (startHeight / 2);
		g.fillRect(tlX, tlY, startWidth, startHeight);

		drawSquare1(g, tlX, tlY, startWidth, startHeight);
	}

	
	public void drawSquare1(Graphics g, int maxX, int maxY, int ogWidth, int ogHeight) {

		int newWidth = ogWidth /2;
		int newHeight = ogHeight /2;

		int tlX = maxX ;
		int tlY = maxY;

		int trX = maxX + ogWidth;
		int trY = maxY;

		//g.fillRect()
		
		topLeft(g, tlX, tlY, newWidth, newHeight);
		//topRight(g,trX,trY, newWidth, newHeight);
		
		//bottomLeft(g, tlX, tlY, newWidth, newHeight);
		//bottomRight(g, tlX, tlY, newWidth, newHeight);

	}

	static int tL = 0;
	/*public void topLeft(Graphics g, int brX, int brY, int Width, int Height) {

		int tlX = brX - Width;
		int tlY = brY - Height;

		g.fillRect(tlX, tlY, Width, Height);

		if (tL < 5) {
			delay(5000);
			tL++;
			drawSquare1(g, tlX, tlY, Width, Height);

		}
	}*/
	
	public void topLeft(Graphics g, int brX, int brY, int Width, int Height) {

		int tlX = brX - Width;
		int tlY = brY - Height;

		int newWidth = Width /2;
		int newHeight = Height /2;
		
		g.fillRect(tlX, tlY, newWidth, newHeight);
		topRight(g, tlX, tlY, newWidth, newHeight);

		if (tL < 5) {
			delay(5000);
			tL++;
			topLeft(g, tlX, tlY, newWidth, newHeight);

		}
	}

	static int tr = 0;
	public void topRight(Graphics g, int farX, int farY, int Width, int Height) {

		int tlX = farX + Width;
		int tlY = farY - Height;
		g.fillRect(tlX, tlY, Width, Height);
		//g.fillRect(50, 50, 200, 235);
		
		if (tr < 5) {
			delay(5000);
			System.out.println("Activating top right");
			tr++;
			//drawSquare1(g, tlX, tlY, Width, Height);
		}

	}
	
	
	/*public void topRight(Graphics g, int blX, int blY, int Width, int Height) {

		int tlX = blX;
		int tlY = blY - Height;
		g.fillRect(tlX, tlY, Width, Height);
		//g.fillRect(50, 50, 200, 235);
		
		if (tr < 5) {
			delay(5000);
			System.out.println("Activating top right");
			tr++;
			drawSquare1(g, tlX, tlY, Width, Height);
		}

	}*/

	public void bottomLeft(Graphics g, int maxX, int maxY, int ogWidth,
			int ogHeight) {

		int startWidth = ogWidth / 2;
		int startHeight = ogHeight / 2;
		int tlX = maxX - (ogWidth / 2);
		int tlY = maxY + ogHeight;
		g.fillRect(tlX, tlY, startWidth, startHeight);
	}

	public void bottomRight(Graphics g, int maxX, int maxY, int ogWidth,
			int ogHeight) {

		int startWidth = ogWidth / 2;
		int startHeight = ogHeight / 2;
		int tlX = maxX + (ogWidth);
		int tlY = maxY + (ogHeight);
		g.fillRect(tlX, tlY, startWidth, startHeight);
	}

	public void delay(long n) {
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}

}
