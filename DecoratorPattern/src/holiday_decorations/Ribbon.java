package holiday_decorations;

public class Ribbon extends TreeDecorator {
   public Ribbon(final Tree tree) {
      super(tree);
   }


   @Override
   public int cost() {
      return super.getTree().cost() + 2;
   }

   @Override
   public String description() {
      return super.getTree().description() + "Ribbon, ";
   }
}