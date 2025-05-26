package mains.Singelton;

import helper.singelton.*;

public class ThreadSafeSingeltonDesignPattern {
    public static void main(String[] args) {
        Runnable runableTask = () -> {
            var instance = ThreadSafeSingleton.getInstance();
            System.out.println(String.format("Hash code of instance %s with thread %s", instance.hashCode(), Thread.currentThread().getName()));

        };
        var t1 = new Thread(runableTask);
        var t2 = new Thread(runableTask);
        t1.start();
        t2.start();
    }
}
