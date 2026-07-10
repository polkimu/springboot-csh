package net.likelion.bebc25.intelij;

import org.springframework.stereotype.Component;

@Component
public class Driver {
    private Car car;

    // DI
    Driver(Car car){
        System.out.println("called constructor injection : " + car);
        this.car = car;
    }

    public void driveCar(int maxSpeed){
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}
