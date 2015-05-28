/**
 * Created by Lucas on 27/04/2015.
 */
public class ItemIlumination extends Item implements IItemIlumination {
    private Double ilumination;

    public ItemIlumination(String name, String description, Double findProb, IPosition pos) {
        super(name, description, findProb, pos);
    }

    @Override
    public Double getIlumination() {
        return ilumination;
    }

    @Override
    public void setIlumination(Double light) {
        this.ilumination = ilumination;
    }
}
