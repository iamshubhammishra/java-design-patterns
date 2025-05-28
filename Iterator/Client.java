package Iterator;

public class Client {
    public static void main(String[] args) {
        var names = new NameRepository();
        var iterator = names.createIterator();
        while(iterator.hasNext()){
            System.out.println("Name: " + iterator.next());
        }
    }
}
