import java.util.Hashtable;

/**
 * Created by Lucas on 26/04/2015.
 */
public class Item implements IItem{
    protected String name;
    protected String description;
    protected Double findProb;
    protected IPosition pos;

    public Item(String name, String description,
                Double findProb, IPosition pos){
        this.name = name;
        this.description = description;
        this.findProb = findProb;
        this.pos = pos;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getFindProb(){
        return findProb;
    }
    public IPosition getPosition(){
        return pos;
    }
}
