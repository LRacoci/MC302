package mobModule.mobComponent;

import mobModule.IFactory;

public class MobFactory implements IFactory<IMob> {

    public IMob instantiate(String subtype, String name) {
    	IMob mob = null;
        switch(subtype){
            case "Monstro":
                mob = new Monstro(name);
            case "Player":
                mob = new Player(name);

        }
        return mob;
    }
    
    public IPlayer instantiatePlayer(String name) {
    	return new Player(name);
    }

}
