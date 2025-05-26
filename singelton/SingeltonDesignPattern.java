package singelton;

import singelton.model.SingeltonPattern;

public class SingeltonDesignPattern {
    public static void main(String[] args) {

        var instanceOne = SingeltonPattern.getInstance();
        var instanceTwo = SingeltonPattern.getInstance();

        System.out.println(String.format("Hash code of instanceOne %s", instanceOne.hashCode()));
        System.out.println(String.format("Hash code of instanceTwo %s", instanceTwo.hashCode()));
    }
}
