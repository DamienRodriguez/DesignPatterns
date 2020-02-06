package holiday_decorations;

public class BallsSilver extends TreeDecorator {
   public BallsSilver(final Tree tree) {
      super(tree);
   }


   @Override
   public int cost() {
      return super.getTree().cost() + 2;
   }

   @Override
   public String description() {
      return super.getTree().description() + "Silver Balls, ";
   }
}