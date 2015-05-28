import java.util.Hashtable;
import java.util.List;

/**
 * Created by Lucas on 26/04/2015.
 */
public abstract class Mob implements IMob{
    protected IPosition position;
    protected Hashtable<String,IAttribute> atts;
    protected String name;

    protected Mob(String name, IPosition position,
                  Hashtable<String,IAttribute> atts){
        this.name = name;
        this.position = position;
        this.atts = atts;
    }

    protected Mob(String name, IPosition position,
                  List<IAttribute> atts){
        this.name = name;
        this.position = position;
        for(IAttribute attribute : atts){
            String attName = attribute.getName();
            Double attValue = attribute.getValue();
            this.putAtt(attName, attValue);
        }
    }
    public IAttribute getAtt(String type){

        return atts.get(type);
    }
    public void setAtt(String type, IAttribute novo){
        atts.remove(type);
        atts.put(type, novo);
    }
    public Boolean hasAtt(String name){
        return atts.contains(name);
    }
    public void putAtt( String attName, Double attValue){
        IAttribute novo = new Attribute(attName, attValue);
        atts.put(attName, novo);
    }
    public IPosition getPosition(){
       return  position;
    }
    public void setPosition(IPosition position){

        this.position = position;
    }
    public abstract IMob clone();

}
