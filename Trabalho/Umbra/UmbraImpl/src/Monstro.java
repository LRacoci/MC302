import java.util.Hashtable;
import java.util.List;

/**
 * Created by Lucas on 26/04/2015.
 */
public  class Monstro extends Mob implements IMonstro {
    private Integer id;
    public Monstro(String name, IPosition position,
                   List<IAttribute> atts, Integer id){
        super(name, position, atts);
        this.id = id;
    }

    public Monstro(String name, IPosition position, Hashtable<String, IAttribute> atts, Integer id) {
        super(name, position, atts);
        this.id = id;
    }

    public void setId(Integer id){

        this.id = id;
    }
    public Integer getId(){

        return id;
    }
    public IMob clone(){

        IMob clone = new Monstro(name, position, atts, id);
        return clone;
    }

}
