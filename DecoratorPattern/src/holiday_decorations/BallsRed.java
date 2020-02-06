package holiday_decorations;

public class BallsRed extends TreeDecorator {
   public BallsRed(final Tree tree) {
      super(tree);
   }


   @Override
   public int cost() {
      return super.getTree().cost() + 1;
   }

   @Override
   public String description() {
      return super.getTree().description() + "Red Balls, ";
   }
}