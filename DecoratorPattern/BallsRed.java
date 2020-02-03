public class BallsRed extends TreeDecorator {
   public BallsRed(final Tree tree) {
      super(tree);
   }


   @Override
   public int cost() {
      return super.getTree().cost() + 1;
   }
}