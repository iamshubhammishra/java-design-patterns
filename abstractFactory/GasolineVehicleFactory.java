package abstractFactory;

import abstractFactory.model.*;

public class GasolineVehicleFactory implements VehicleFactory {
    public Car createCar() {
        return new GasolineCar();
    }

    public Bike createBike() {
        return new GasolineBike();
    }
}