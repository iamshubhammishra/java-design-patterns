package solidPrinciple.interfacesegregation.gooddesign;

import solidPrinciple.interfacesegregation.baddesign.Worker;

public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Working...");
    }

}
