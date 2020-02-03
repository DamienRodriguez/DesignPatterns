public class Ruffles extends TreeDecorator {
   public Ruffles(final Tree tree) {
      super(tree);
   }
   
   @Override 
   public int cost() {
      return super.getTree().cost() + 1;
   }
}