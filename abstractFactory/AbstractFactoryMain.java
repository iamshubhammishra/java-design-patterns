package abstractFactory;

import abstractFactory.model.Bike;
import abstractFactory.model.Car;
import abstractFactory.model.VehicleFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        VehicleFactory factory;

        // Switch between electric and gasoline
        factory = new ElectricVehicleFactory();
        Car eCar = factory.createCar();
        Bike eBike = factory.createBike();
        eCar.assemble();
        eBike.assemble();

        factory = new GasolineVehicleFactory();
        Car gCar = factory.createCar();
        Bike gBike = factory.createBike();
        gCar.assemble();
        gBike.assemble();
    }
}
