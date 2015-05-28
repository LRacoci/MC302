package mobModule;

import mobModule.mobComponent.IMob;

/**
 * Created by racoci on 07/05/15.
 */
public interface IFactory<T> {
    public T instantiate(String subtype, String nameNew);
}
