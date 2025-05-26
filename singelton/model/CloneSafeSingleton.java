package singelton.model;

public class CloneSafeSingleton implements Cloneable {
    private static CloneSafeSingleton instance = null;

    private CloneSafeSingleton() {

    }

    public static CloneSafeSingleton getInstance() {
        if (instance == null) {
            instance = new CloneSafeSingleton();
        }
        return instance;
    }
     protected Object readResolve(){
        return instance;
     }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning not allowed");
    }
}
