public class DecorationBulb extends Decoration{
    public DecorationBulb(int positionInTree, DecorativeTree christmasTree) {
        super(positionInTree, christmasTree);
    }

    @Override
    public String getDecoration() {
        return "B";
    }

}
