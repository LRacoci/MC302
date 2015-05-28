import java.util.List;

/**
 * Created by Lucas on 26/04/2015.
 */
public class ItemBattle extends Item implements IItemBattle  {
    List<IModAtt> modatts;
    public ItemBattle(String name, String description,
                      Double findProb, IPosition pos){
        super(name, description, findProb, pos);
    }

    public IMob updateMob(IMob src) {
        IMob returnValue;
        returnValue = src.clone();
        for(IModAtt modatt : modatts){
            if(src.hasAtt(modatt.getName())){
                IAttribute update = modatt.modify(src.getAtt(modatt.getName()));
                src.setAtt(modatt.getName(), update);
            }
        }
        return returnValue;
    }

    public void newModAtt(String name, IModAtt modAtt ) {
        modatts.add(modatts.size(), modAtt);
    }

    public List<IModAtt> getModAtts() {
        return modatts;
    }
}
