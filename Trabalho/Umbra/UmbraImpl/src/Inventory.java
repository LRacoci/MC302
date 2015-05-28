import java.util.Hashtable;

/**
 * Created by Lucas on 26/04/2015.
 */
public class Inventory {
    private Double size;
    private Hashtable<String, IItem> items;

    public IItem dropItem(String witch){
        IItem resp = items.get(witch);
        items.remove(witch);
        return resp;
    }
    public void setSize(Double size){
        this.size = size;
    }
    public void adItem(IItem item){
        items.put(item.getName(), item);
    }
    public Double getSize(){
        return size;
    }
}
