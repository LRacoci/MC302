
/**
 * Created by Lucas on 26/04/2015.
 */
public class ModAtt implements IModAtt {
    private String attName;
    private Double operation;

    public ModAtt(String attName, Double operation){
        this.attName = attName;
        this.operation = operation;
    }

    public IAttribute modify(IAttribute src) {
        IAttribute returnValue = src.clone();
        returnValue.setValue(src.getValue() + operation);
        return returnValue;

    }

    public String getName() {
        return attName;
    }
}
