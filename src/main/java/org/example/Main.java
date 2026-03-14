package org.example;

import org.example.company.Car;
import org.example.arge.CarSkeleton;
import org.example.arge.GasPoweredCar;
import org.example.arge.ElectricCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Car.Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Car.Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Car.Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        CarSkeleton gasCar = new GasPoweredCar("Toyota", "Gas Car", 15.5, 6);
        System.out.println(gasCar.startEngine());
        System.out.println(gasCar.drive());

        CarSkeleton electricCar = new ElectricCar("Tesla", "Electric Car", 400.0, 100);
        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());

        CarSkeleton hybridCar = new HybridCar("Prius", "Hybrid Car", 20.0, 50);
        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());
    }
}