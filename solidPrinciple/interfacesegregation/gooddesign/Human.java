package solidPrinciple.interfacesegregation.gooddesign;

import solidPrinciple.interfacesegregation.baddesign.Worker;

public class Human  implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
}
