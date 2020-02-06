package holiday_decorations;

public class FraserFir implements Tree {


   @Override
   public int cost() {
      
      return 35;
   }

   @Override
   public String description() {
      return "Fraser Fir with ";
   }
}