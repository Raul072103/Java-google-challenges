public class DecorationGarland extends Decoration{
    public DecorationGarland(int positionInTree, DecorativeTree christmasTree) {
        super(positionInTree, christmasTree);
    }

    @Override
    public String getDecoration() {
        return "G";
    }
}
