package prototype;

public class Pizza implements Prototype {
    private String size;
    private String toppings;
    private boolean extraCheese;

    public Pizza(String size, boolean extraCheese) {
        this.size = size;
        this.extraCheese = extraCheese;
    }

    public Pizza(String size, String toppings, boolean extraCheese) {
        this.size = size;
        this.extraCheese = extraCheese;
        this.toppings = toppings;
    }

    @Override
    public Prototype clone() {
        // Deep copy logic
        return new Pizza(size, toppings, extraCheese);
    }

    public void display() {
        System.out.println("Pizza: " + size + ", " + toppings +
                (extraCheese ? ", Extra Cheese" : ""));
    }

    public void loadTopping(){
        //add toppings take time
        try {
            System.out.println("Adding toppings");
            this.toppings="capsicum,olive";
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
