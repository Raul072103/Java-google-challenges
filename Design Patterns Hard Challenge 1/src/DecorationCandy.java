public class DecorationCandy extends Decoration {
    public DecorationCandy(int positionInTree, DecorativeTree christmasTree) {
        super(positionInTree, christmasTree);
    }

    @Override
    public String getDecoration() {
        return "C";
    }
}
