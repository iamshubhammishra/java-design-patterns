package singelton;

import singelton.model.CloneSafeSingleton;
import singelton.model.SingeltonPattern;

public class CloneSafeSingeltonDesignPattern {
    public static void main(String[] args) throws CloneNotSupportedException {

        var instanceOne = SingeltonPattern.getInstance();

        //Break using clone
        var instanceTwo = instanceOne.clone(); //new instance
        System.out.println(String.format("Hash code of instanceOne %s", instanceOne.hashCode()));
        System.out.println(String.format("Hash code of instanceTwo %s", instanceTwo.hashCode()));

        //Clone safe
        var instanceThree = CloneSafeSingleton.getInstance(); //new instance
        var instanceFour = instanceThree.clone(); //get exception clone not supported
        System.out.println(String.format("Hash code of instanceThree %s", instanceThree.hashCode()));
        System.out.println(String.format("Hash code of instanceFour %s", instanceFour.hashCode()));
    }
}
