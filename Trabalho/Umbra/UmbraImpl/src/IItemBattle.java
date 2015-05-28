import java.util.List;

/**
 * Created by Lucas on 26/04/2015.
 */
public interface IItemBattle extends IItem {
    public IMob updateMob(IMob src);
    public void newModAtt(String name, IModAtt modAtt);
    public List<IModAtt> getModAtts();
}
