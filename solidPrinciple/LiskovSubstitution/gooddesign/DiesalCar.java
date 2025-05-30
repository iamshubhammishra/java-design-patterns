package solidPrinciple.LiskovSubstitution.gooddesign;

import solidPrinciple.LiskovSubstitution.baddesign.Car;
import solidPrinciple.LiskovSubstitution.baddesign.Engine;

public class DiesalCar implements EngineCar {
    private Engine engine;
    @Override
    public void turnOnEngine() {
        //turn on the engine!
        engine.start();
    }

    @Override
    public void accelerate() {

    }
}
