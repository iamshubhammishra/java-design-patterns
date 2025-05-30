package solidPrinciple.dependencyinjection.gooddesign;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Lightbub on");
    }
}
