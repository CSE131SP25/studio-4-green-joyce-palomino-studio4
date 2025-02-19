package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean trueFalse = in.nextBoolean();
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		
		
		
		StdDraw.setPenColor(r, g, b);
		if (shape .equals ("rectangle")) {
			if (trueFalse == true) {
				StdDraw.filledRectangle(x1, y1, halfWidth, halfHeight);
			}
			else {
				StdDraw.rectangle(x1, y1, halfWidth, halfHeight);
			}
		}
		else if (shape .equals(("ellipse"))) {
			if (trueFalse == true) {
				StdDraw.filledEllipse(x1, y1, halfWidth, halfHeight);
			}
			else {
				StdDraw.ellipse(x1, y1, halfWidth, halfHeight);
			}
		
		}
		else if (shape .equals("triangle")){	
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			
			double[] xCoordinate = {x1, halfWidth, x3};
			double[] yCoordinate = {y1, halfHeight, y3};
			
			if (trueFalse == true) {
		StdDraw.filledPolygon(xCoordinate, yCoordinate);
			}
			else {
				StdDraw.polygon(xCoordinate, yCoordinate);
			}
		}
	}
}
