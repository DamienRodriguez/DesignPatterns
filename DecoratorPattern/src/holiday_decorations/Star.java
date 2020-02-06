package holiday_decorations;

public class Star extends TreeDecorator {


    private Star(Tree tree) {
        super(tree);
    }

    public static Star getStar(final Tree tree) {

        if(tree.description().indexOf("Star") == -1)
            return new Star(tree);

        System.out.println("You can't have more than one star!");
        return (Star) tree;
    }

    @Override
    public int cost() {
        return super.getTree().cost() + 4;
    }

    @Override
    public String description() {
        return super.getTree().description() + "a Star, ";
    }


}
