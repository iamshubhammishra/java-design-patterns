package factory;

public class ShapeFactory {

    public Shape getShape(String type){
        Shape shape = switch (type){
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            default -> new Circle();
        };
        return shape;
    }
}
