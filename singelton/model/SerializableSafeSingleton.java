package singelton.model;

import java.io.Serializable;

public class SerializableSafeSingleton implements Serializable {
    private static SerializableSafeSingleton instance = null;

    private SerializableSafeSingleton() {

    }

    public static SerializableSafeSingleton getInstance() {
        if (instance == null) {
            instance = new SerializableSafeSingleton();
        }
        return instance;
    }
     protected Object readResolve(){
        return instance;
     }
}
