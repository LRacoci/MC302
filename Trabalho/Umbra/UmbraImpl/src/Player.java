import java.util.Hashtable;
import java.util.List;

/**
 * Created by Lucas on 26/04/2015.
 */
public class Player extends Mob implements IPlayer {
    IInventory inventory = null;
    public Player(String name, IPosition position, List<IAttribute> atts){
        super(name, position, atts);
    }

    public Player(String name, IPosition position, List<IAttribute> atts, List<IItem> items){
        super(name, position, atts);
        for(IItem item : items){
            inventory.adItem(item);
        }
    }

    public Player(String name, IPosition position, Hashtable<String, IAttribute> atts, IInventory inventory) {
        super(name, position, atts);
        this.inventory = inventory;
    }

    public IInventory getInventory() {

        return inventory;
    }
    public IMob clone(){

        IMob clone = new Player(name, position, atts, inventory);
        return clone;
    }
}
