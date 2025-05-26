package singelton;

import singelton.model.ReflectionSafeSingleton;
import singelton.model.SingeltonPattern;

import java.lang.reflect.InvocationTargetException;

public class ReflectionSafeSingeltonDesignPattern {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //Break using reflection
        var instanceOne = SingeltonPattern.getInstance();
        var constructor = SingeltonPattern.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        var instanceTwo = constructor.newInstance();
        System.out.println(String.format("Hash code of instanceOne %s", instanceOne.hashCode()));
        System.out.println(String.format("Hash code of instanceTwo %s", instanceTwo.hashCode()));

        //Safe
        var instanceThree = ReflectionSafeSingleton.getInstance();
        var constructorSecond = ReflectionSafeSingleton.class.getDeclaredConstructor();
        constructorSecond.setAccessible(true);
        var instanceFour = constructorSecond.newInstance();

        System.out.println(String.format("Hash code of instanceThree %s", instanceThree.hashCode()));
        System.out.println(String.format("Hash code of instanceFour %s", instanceFour.hashCode()));

    }
}
