package mobModule.mobComponent;

import anima.annotation.ComponentInterface;
import anima.component.ISupports;

@ComponentInterface("http://purl.org/NET/dcc/mobcomponent.inter.IMobComponent")

public interface IMobManager extends ISupports {
	public IMob create(String name);
}
