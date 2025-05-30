package solidPrinciple.dependencyinjection.gooddesign;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan on");
    }
}
