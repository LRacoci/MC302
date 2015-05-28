import mobModule.mobComponent.MobManager;
import mobModule.mobComponent.IMobManager;
import mobModule.mobComponent.IMob;
import anima.factory.IGlobalFactory;
import anima.factory.context.componentContext.ComponentContextFactory;

public class Principal {
	public static void main(String[] args) {
		try {
			IGlobalFactory factory = ComponentContextFactory.createGlobalFactory();
			factory.registerPrototype(MobManager.class);
			IMobManager component = factory.createInstance("<http://purl.org/NET/dcc/mobcomponent.impl.MobComponent>");
			IMob monstro = component.create("Monstro");
			monstro.putAtt("HP", 100);
			System.out.println(monstro.getAtt("HP").getValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
