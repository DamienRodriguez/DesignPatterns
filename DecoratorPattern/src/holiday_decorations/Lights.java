package holiday_decorations;

public class Lights extends TreeDecorator {
   public Lights(final Tree tree) {
      super(tree);
   }


   @Override
   public int cost() {
      return super.getTree().cost() + 5;
   }

   @Override
   public String description() {
      return super.getTree().description() + "Lights, ";
   }
}