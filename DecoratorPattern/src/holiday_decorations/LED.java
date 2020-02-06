package holiday_decorations;

public class LED extends TreeDecorator {
   public LED(final Tree tree) {
      super(tree);
   }

   @Override
   public int cost() {
      return super.getTree().cost() + 10;
   }

   @Override
   public String description() {
      return super.getTree().description() + "LEDs, ";
   }
}