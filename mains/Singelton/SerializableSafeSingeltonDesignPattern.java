package mains.Singelton;

import helper.singelton.*;

import java.io.*;

public class SerializableSafeSingeltonDesignPattern {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Break using Serialization and Deserialization
        var instanceOne = SingeltonPattern.getInstance();
        var outputStream = new ObjectOutputStream(new FileOutputStream("obj"));
        outputStream.writeObject(instanceOne);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj"));
        var instanceTwo = (SingeltonPattern) in.readObject();

        System.out.println(String.format("Hash code of instanceOne %s", instanceOne.hashCode()));
        System.out.println(String.format("Hash code of instanceTwo %s", instanceTwo.hashCode()));


        //Safe
        var instanceThree = SerializableSafeSingleton.getInstance();
        var outputStreamSecond = new ObjectOutputStream(new FileOutputStream("obj"));
        outputStreamSecond.writeObject(instanceThree);

        var inputStreamSecond = new ObjectInputStream(new FileInputStream("obj"));
        var instanceFour = (SerializableSafeSingleton) inputStreamSecond.readObject();

        System.out.println(String.format("Hash code of instanceThree %s", instanceThree.hashCode()));
        System.out.println(String.format("Hash code of instanceFour %s", instanceFour.hashCode()));
    }
}
