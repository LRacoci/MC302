import java.util.List;

/**
 * Created by Lucas on 26/04/2015.
 */
public interface IItemPuzzle extends IItem {

    public List<String> getAdjectives();
    public void newAdjective(String newAdj);
    public void modAdj(String src, String newAdj);
}
