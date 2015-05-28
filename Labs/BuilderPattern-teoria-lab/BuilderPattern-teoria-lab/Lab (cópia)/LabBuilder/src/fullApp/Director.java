package fullApp;


public class Director implements IDirector{
    IBuilder builder;
    public Director(IBuilder b){
        builder = b;
    }
    public void construct(){
        builder.printHead();
        builder.printBody();
        builder.printLegs();
    }
}
