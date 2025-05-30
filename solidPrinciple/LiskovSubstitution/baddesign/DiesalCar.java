package solidPrinciple.LiskovSubstitution.baddesign;

public class DiesalCar implements Car{
    private Engine engine;
    @Override
    public void turnOnEngine() {
        //turn on the engine!
        engine.start();
    }

    @Override
    public void accelerate() {
        //move forward!
        engine.setSpeed(1000);
    }
}
