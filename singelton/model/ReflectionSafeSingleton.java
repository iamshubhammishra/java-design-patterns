package singelton.model;

import java.io.Serializable;

public class ReflectionSafeSingleton implements Serializable {
    private static ReflectionSafeSingleton instance = null;

    private  ReflectionSafeSingleton() {
        if(instance!=null){
            throw  new RuntimeException("Instance is already created use getInstance()");
        }
    }

    public static ReflectionSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ReflectionSafeSingleton();
        }
        return instance;
    }
}
