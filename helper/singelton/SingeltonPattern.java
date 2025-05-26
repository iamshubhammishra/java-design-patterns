package helper.singelton;

import java.io.Serializable;

public class SingeltonPattern implements Serializable, Cloneable {
    private static SingeltonPattern instance = null;

    private SingeltonPattern() {

    }

    public static SingeltonPattern getInstance() {
        if (instance == null) {
            instance = new SingeltonPattern();
        }
        return instance;
    }

    @Override
    public SingeltonPattern clone() {
        try {
            SingeltonPattern clone = (SingeltonPattern) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
