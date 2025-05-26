package mains.Singelton;

import helper.singelton.EnumSingelton;

public class EnumSingeltonDesignPattern {
    public static void main(String[] args) {
        var instanceOne = EnumSingelton.INSTANCE;
        var instanceTwo = EnumSingelton.INSTANCE;

        instanceOne.showMessage();

        // Check if both are the same instance
        System.out.println("HashCode 1: " + instanceOne.hashCode());
        System.out.println("HashCode 2: " + instanceTwo.hashCode());
        System.out.println("Same instance? " + (instanceOne == instanceTwo));
    }
}
