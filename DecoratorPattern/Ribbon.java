public class Ribbon extends TreeDecorator {
   public Ribbon(final Tree tree) {
      super(tree);
   }


   @Override
   public int cost() {
      return super.getTree().cost() + 2;
   }
}