package solidPrinciple.interfacesegregation.baddesign;

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    public void eat() {
        // Robots don't eat!
    }
}
