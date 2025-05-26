package helper.singelton;

public class ThreadSafeSingleton implements Cloneable {
    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {

    }

    public static ThreadSafeSingleton getInstance() {
        //Use double-checked locking
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }

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
