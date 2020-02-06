package holiday_decorations;

public class DouglasFir implements Tree {

   @Override
   public int cost() {
      return 30;
   }

   @Override
   public String description() {
      return "Douglas Fir with ";
   }
}