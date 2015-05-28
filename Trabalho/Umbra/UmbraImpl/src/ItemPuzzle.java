import java.util.List;

/**
 * Created by Lucas on 26/04/2015.
 */
public class ItemPuzzle extends Item implements IItemPuzzle {
    private List<String> adjectives;

    public ItemPuzzle(String name, String description,
                      Double findProb, IPosition pos){
        super(name, description, findProb, pos);
    }
    public List<String> getAdjectives() {
        return adjectives;
    }

    public void newAdjective(String newAdj) {
        adjectives.add(adjectives.size(), newAdj);
    }

    public void modAdj(String src, String newAdj) {
        adjectives.remove(adjectives.indexOf(src));
        adjectives.add(adjectives.indexOf(src), newAdj);
    }
}
