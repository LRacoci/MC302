/**
 * Created by Lucas on 26/04/2015.
 */
public interface IInventory {
    public IItem dropItem();
    public void setSize(Integer size);
    public void adItem(IItem item);
    public Double getSize();
}
