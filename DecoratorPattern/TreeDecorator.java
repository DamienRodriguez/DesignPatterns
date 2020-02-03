public abstract class TreeDecorator implements Tree {

   private Tree tree;
   
   public TreeDecorator(final Tree tree) {
      
      setTree(tree);
   }
   
   public void setTree(final Tree tree) {
      this.tree = tree;
   }
   
   public int cost() {
   
      return this.tree.cost();
   }
   
   public Tree getTree() {
      return this.tree;
   }





}