public class Tester {

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   // To-do List:
   //    Refactor the Balls code into another abstract class and simply have the change be color when calling for the balls
   //    Add star using modified Singleton pattern, check with Kevin, and if not, then try what I can.
   //    Fix output to show what is on the tree, as well as the correct money output
   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
   ////////////////////////////////////////
   // What Works:
   //    Cost works as intended
   //    Heirarchy is structured correctly
   ////////////////////////////////////////
   
   public static void main(String[] args) {
      
      Tree myTree = new DouglasFir(); //cost is 30
      
      myTree = new Ruffles(myTree); //cost is 31
      myTree = new Ribbon(myTree);  //cost is 33
      myTree = new LED(myTree);     //cost is 43
      myTree = new BallsBlue(myTree); //cost is 45
      
      
      Tree aNewTree = new ColoradoBlue(); //Cost is 50
      aNewTree = new LED(aNewTree); //cost is 60
      aNewTree = new BallsSilver(aNewTree);
      aNewTree = new BallsSilver(aNewTree);
      aNewTree = new BallsSilver(aNewTree);  //cost is 66
      
      printTree(myTree);
      printTree(aNewTree);
   }
   
   public static void printTree(final Tree myTree) {
      System.out.println(myTree.cost());
   }

}