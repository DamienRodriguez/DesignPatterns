package holiday_decorations;

public class BalsamFir implements Tree {
   
   @Override
   public int cost() {
      return 25;
   }

   @Override
   public String description() {
      return "Balsam Fir with ";
   }
}