package builder;

public class Burger {
    private String bun;
    private String patty;
    private String sauce;
    private boolean cheese;
    private boolean lettuce;

    private Burger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
    }

    public void display() {
        System.out.println("Burger with: " + bun + ", " + patty + ", " + sauce +
                (cheese ? ", cheese" : "") +
                (lettuce ? ", lettuce" : ""));
    }

    public static class BurgerBuilder {
        private String bun;
        private String patty;
        private String sauce;
        private boolean cheese;
        private boolean lettuce;

        public BurgerBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public BurgerBuilder setPatty(String patty) {
            this.patty = patty;
            return this;
        }

        public BurgerBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BurgerBuilder addCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder addLettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
