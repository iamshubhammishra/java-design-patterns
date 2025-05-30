package solidPrinciple.interfacesegregation.baddesign;

public class Human  implements Worker{
    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
}
