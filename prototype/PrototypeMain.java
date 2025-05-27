package prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Pizza original = new Pizza("Large", true);
        original.loadTopping();
        Pizza copy = (Pizza) original.clone();

        original.display(); // Pizza: Large, Olives, Jalapeños, Extra Cheese
        copy.display();     // Pizza: Large, Olives, Jalapeños, Extra Cheese
    }
}
