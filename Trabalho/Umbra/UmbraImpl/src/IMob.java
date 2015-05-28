/**
 * Created by Lucas on 26/04/2015.
 */
public interface IMob {
    public IAttribute getAtt(String type);
    public void setAtt(String type, IAttribute novo);
    public void putAtt( String attName, Double attValue);
    public Boolean hasAtt(String name);
    public IPosition getPosition();
    public void setPosition(IPosition position);
    public IMob clone();

}
