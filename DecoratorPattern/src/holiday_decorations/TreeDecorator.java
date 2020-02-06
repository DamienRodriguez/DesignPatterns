package holiday_decorations;

public abstract class TreeDecorator implements Tree {

   private Tree tree;
   
   public TreeDecorator(final Tree tree) {
      
      setTree(tree);
   }
   
   public void setTree(final Tree tree) {
      this.tree = tree;
   }
   
   public Tree getTree() {
      return this.tree;
   }
   
   public int cost() {
   
      return this.tree.cost();
   }

   public String description() {
      return this.tree.description();
   }
   
   





}