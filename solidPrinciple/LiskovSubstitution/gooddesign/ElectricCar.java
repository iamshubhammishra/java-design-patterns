package solidPrinciple.LiskovSubstitution.gooddesign;

import solidPrinciple.LiskovSubstitution.gooddesign.Car;

public class ElectricCar implements Car {

    public void accelerate() {
        System.out.println("Electric acceleration is instant!");
    }
}