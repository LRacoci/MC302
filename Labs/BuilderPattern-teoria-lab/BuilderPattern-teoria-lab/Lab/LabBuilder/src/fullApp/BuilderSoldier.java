package fullApp;


public class BuilderSoldier extends AbstractBuilder {
    private  static final String tipo = "soldier";
    public void printHead() {
        String parte = "head";
        result.append(getFileContent(buildPath(tipo, parte)));
    }

    public void printBody() {
        String parte = "body";
        result.append(getFileContent(buildPath(tipo, parte)));
    }

    public void printLegs() {
        String parte = "legs";
        result.append(getFileContent(buildPath(tipo, parte)));
    }
    public StringBuilder getResult(){
        return result;
    }
}
