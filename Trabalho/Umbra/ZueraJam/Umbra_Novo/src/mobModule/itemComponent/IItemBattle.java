package mobModule.itemComponent;

import mobModule.*;
import mobModule.mobComponent.*;

import java.util.List;


public interface IItemBattle extends IItemGeneric {
    public IMob updateMob(IMob src);
    public void newModAtt(IModAtt modAtt);
    public List<IModAtt> getModAtts();
}
