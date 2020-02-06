package holiday_decorations;

public class BallsBlue extends TreeDecorator {
   public BallsBlue(final Tree tree) {
      super(tree);
   }


   @Override
   public int cost() {
      return super.getTree().cost() + 2;
   }

   @Override
   public String description() {
      return super.getTree().description() + "Blue Balls, ";
   }
}