package builder;

public class BuilderMain {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .setBun("Wheat Bun")
                .setPatty("Chicken")
                .setSauce("Mayo")
                .addCheese(true)
                .addLettuce(true)
                .build();

        burger.display();
    }
}
