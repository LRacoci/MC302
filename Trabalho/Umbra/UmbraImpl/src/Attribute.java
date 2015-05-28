/**
 * Created by Lucas on 26/04/2015.
 */
public class Attribute implements IAttribute {
    private String name;
    private Double value;

    public Attribute(String name, Double value){
        this.name = name;
        this.value = value;
    }
    public String getName(){
        return name;
    }
    public Double getValue(){
        return value;
    }
    public void setValue(Double value){
        this.value = value;
    }

    public IAttribute clone() {
        return new Attribute(name, value);
    }
}
