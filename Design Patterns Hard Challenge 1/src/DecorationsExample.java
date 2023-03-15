import java.util.List;

public class DecorationsExample {
    public static void main(String[] args) {
        DecorativeTree christmasTree = new ChristmasTree();

        DecorativeTree decoratedTree = christmasTree;
        decoratedTree = new DecorationCandy(3, decoratedTree);
        decoratedTree = new DecorationBulb(6, decoratedTree);
        decoratedTree = new DecorationGarland(8, decoratedTree);

        decoratedTree.display();
        christmasTree.display();
    }
}
