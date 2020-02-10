import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;
import shapes.*;





/* To-Do
 * Fix the compareTo, because it seems to not be working
 * Set up RNG styled creator to fill list with random shapes with random values
 * Write up UML for the homework
 * Profit
 */
public class ShapeTester {

	public static void main(String[] args) {
		ArrayList<Shape> myList = new ArrayList<Shape>();
		ShapeFactory factory = new ShapeFactory();
		DecimalFormat df = new DecimalFormat("###.####");
		
		
		
		myList.add(factory.createCircle(1));
		myList.add(factory.createTriangle(4,5));
		myList.add(factory.createSquare(2));
		myList.add(factory.createRectangle(5,8));
		
		myList.trimToSize();
		
		for(int x = 0; x < myList.size(); x++) {
			System.out.println("Shape: " + myList.get(x).name() + " Area: " + df.format(myList.get(x).area()));
		}
		
		Collections.sort(myList);
		
		for(int x = 0; x < myList.size(); x++) {
			System.out.println("Shape: " + myList.get(x).name() + " Area: " + df.format(myList.get(x).area()));
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
