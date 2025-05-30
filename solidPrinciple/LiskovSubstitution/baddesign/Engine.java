package solidPrinciple.LiskovSubstitution.baddesign;

public class Engine {

    public void start(){
        System.out.println("Engine Started");
    }

    public void setSpeed(int speed){
        //turn on the engine!
        System.out.println("Speed set to :" + speed);
    }
}
