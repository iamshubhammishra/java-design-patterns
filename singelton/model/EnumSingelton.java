package singelton.model;

public enum EnumSingelton {
    INSTANCE;
    public void showMessage() {
        System.out.println("Hello from Singleton Enum!");
    }
}
