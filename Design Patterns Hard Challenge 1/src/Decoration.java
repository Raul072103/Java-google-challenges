import java.util.ArrayList;
import java.util.List;

public abstract class Decoration implements DecorativeTree{
    protected int positionInTree;
    protected DecorativeTree  christmasTree;

    public Decoration(int positionInTree, DecorativeTree christmasTree){
        this.christmasTree = christmasTree;
        this.positionInTree = positionInTree;
    }

    public List<List<String>> getTree(){
        List<List<String>>  originalUnmodifiableTree = christmasTree.getTree();
        List<List<String>> decoratedTree = new ArrayList<>(originalUnmodifiableTree);
        int left = decoratedTree.get(positionInTree).indexOf("<");
        int right = decoratedTree.get(positionInTree).indexOf(">");

        List<String> originalUnmodifiableTreeRow = decoratedTree.get(positionInTree);
        List<String> decoratedTreeRow = new ArrayList<>(originalUnmodifiableTreeRow);

        for (int i = left + 1; i < right; i++) {
            decoratedTreeRow.set(i, getDecoration());
        }
        decoratedTree.set(positionInTree, decoratedTreeRow);
        return decoratedTree;
    }

    public abstract String getDecoration();

    @Override
    public void display() {
        List<List<String>> tree = this.getTree();
        for (int i = 0; i < tree.size(); i++) {
            for (int j = 0; j < tree.get(i).size(); j++) {
                System.out.print(tree.get(i).get(j));
            }
            System.out.println();
        }

    }




}
