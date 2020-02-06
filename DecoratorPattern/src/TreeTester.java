import holiday_decorations.*;

public class TreeTester {

    public static void main(String[] args) {
        Tree tree1 = new DouglasFir();
        Tree tree2 = new ColoradoBlue();

        tree1 = new Ruffles(tree1);
        tree1 = new Ribbon(tree1);
        tree1 = Star.getStar(tree1);
        tree1 = new BallsSilver(tree1);

        tree2 = new Ribbon(tree2);
        tree2 = new Ribbon(tree2);
        tree2 = Star.getStar(tree2);
        tree2 = Star.getStar(tree2);

        printTree(tree1);
        printTree(tree2);
    }

    public static void printTree(final Tree tree) {
        System.out.println("You have a " + tree.description() + "and the total was $" + tree.cost() + ".00 ");
    }

}
