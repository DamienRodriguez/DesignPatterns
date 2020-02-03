public class BallsBlue extends TreeDecorator {
   public BallsBlue(final Tree tree) {
      super(tree);
   }


   @Override
   public int cost() {
      return super.getTree().cost() + 2;
   }
}