package helper.singelton;

public enum EnumSingelton {
    INSTANCE;
    public void showMessage() {
        System.out.println("Hello from Singleton Enum!");
    }
}
