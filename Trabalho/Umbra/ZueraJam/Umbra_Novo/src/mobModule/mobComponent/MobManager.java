package mobModule.mobComponent;

import mobModule.IFactory;
import mobModule.mobComponent.IMobManager;
import anima.annotation.Component;
import anima.component.base.ComponentBase;

@Component(
		id="<http://purl.org/NET/dcc/mobcomponent.impl.MobComponent>",
		provides={"<http://purl.org/NET/dcc/mobcomponent.impl.IMobComponent>"}
)

public class MobManager extends ComponentBase implements IMobManager {
	
	public IMob create(String name) {
		IFactory<IMob> factory = null;
		factory = (IFactory<IMob>) SimpleCreator.create("Mob");
		IMob mob = factory.instantiate(name, "Leo Stronda");
		return mob;
	}
	
}
