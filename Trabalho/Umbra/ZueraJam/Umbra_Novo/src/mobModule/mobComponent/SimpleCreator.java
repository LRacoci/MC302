package mobModule.mobComponent;

import mobModule.IFactory;
import mobModule.itemComponent.ItemFactory;

public class SimpleCreator {
    public static IFactory<?> create(String type_name) {
        switch (type_name){
            case "Mob":
                return new MobFactory ();
            case "Item":
                return new ItemFactory ();

        }
        return null;
    }
}
