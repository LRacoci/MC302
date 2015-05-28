package mobModule.mobComponent;

import mapModule.IPosition;
import mobModule.*;


public interface IMob {
    public String getName();
    public IAttribute getAtt(String type);
    public void setAtt(String type, double value);
    public void putAtt(String attName, double attValue);
    public Boolean hasAtt(String name);
    public IPosition getPosition();
    public void setPosition(IPosition position);

    public IMob clone();

}
