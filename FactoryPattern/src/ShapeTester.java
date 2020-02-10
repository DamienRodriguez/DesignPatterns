import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;
import java.util.Random;
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
      DecimalFormat df = new DecimalFormat("###.####");
      Random rngesus = new Random();
      
      long seed = rngesus.nextLong();
      
      ShapeFactory factory = new ShapeFactory();
      
      initMessage(seed);
      fillList(rngesus,factory,myList);
      printList(myList, df);
      System.out.println("This concludes the demonstration. Have a wonderful day!");
   	
   }
   
   public static void fillList(final Random rng, final ShapeFactory factory, ArrayList<Shape> myList) {
      
      int numOf = rng.nextInt(10) + 1; //adding 1 because this random number could include zero
      int choice = 0;
      int dim1 = 0;
      int dim2 = 0;
      
      System.out.println("Filling list with Shapes...");
      System.out.println("==================================================================");
      
      for(int x = 0; x < numOf; x++) {
         choice = rng.nextInt(4);
         dim1 = rng.nextInt(10) + 1;
         dim2 = rng.nextInt(10) + 1;
         
         if(choice == 0) {
            myList.add(factory.createCircle(dim1));
         }
         else if(choice == 1) {
            myList.add(factory.createSquare(dim1));
         }
         else if(choice == 2) {
            myList.add(factory.createTriangle(dim1,dim2));
         }
         else if(choice == 3) {
            myList.add(factory.createRectangle(dim1,dim2));
         }
      }
      myList.trimToSize();
   }

   public static void initMessage(final long seed) {
      System.out.println("Welcome to the Shape Factory Demo!");
      System.out.println("This demonstration was done using the Random class with shape dimensions ranging from 1 to 10");
      System.out.println("The seed used for this demonstration is: " + seed);
      System.out.println("==================================================================");
    
   }
   
   public static void printList(final ArrayList<Shape> myList, final DecimalFormat df) {
      System.out.println("List of Shapes before sorting");
      for(int x = 0; x < myList.size(); x++) {
         System.out.println("Shape: " + myList.get(x).name() + ". Area: " + df.format(myList.get(x).area()) + " units.");
      }
      
      System.out.println("==================================================================");
      System.out.println("List of Shapes after sorting");
      Collections.sort(myList);
      
      for(int x = 0; x < myList.size(); x++) {
         System.out.println("Shape: " + myList.get(x).name() + ". Area: " + df.format(myList.get(x).area()) + " units.");
      }
      System.out.println("==================================================================");
   
   }


}
