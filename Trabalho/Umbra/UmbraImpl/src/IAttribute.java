/**
 * Created by Lucas on 26/04/2015.
 */
public interface IAttribute {
    public String getName();
    public Double getValue();
    public void setValue(Double value);
    public IAttribute clone();
}
