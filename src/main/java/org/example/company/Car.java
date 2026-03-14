package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() { return name; }
    public int getCylinders() { return cylinders; }

    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "Car - the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }

    @Override
    public String toString() {
        return "Car{engine=" + engine + ", cylinders=" + cylinders +
                ", name='" + name + "', wheels=" + wheels + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }

    public static class Mitsubishi extends Car {
        public Mitsubishi(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            System.out.println(getClass().getSimpleName());
            return "the car's engine is starting";
        }

        @Override
        public String accelerate() {
            System.out.println(getClass().getSimpleName());
            return "Car - the car is accelerating";
        }

        @Override
        public String brake() {
            System.out.println(getClass().getSimpleName());
            return "the car is braking";
        }
    }

    public static class Ford extends Car {
        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            System.out.println(getClass().getSimpleName());
            return "the car's engine is starting";
        }

        @Override
        public String accelerate() {
            System.out.println(getClass().getSimpleName());
            return "Car - the car is accelerating";
        }

        @Override
        public String brake() {
            System.out.println(getClass().getSimpleName());
            return "the car is braking";
        }
    }

    public static class Holden extends Car {
        public Holden(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            System.out.println(getClass().getSimpleName());
            return "the car's engine is starting";
        }

        @Override
        public String accelerate() {
            System.out.println(getClass().getSimpleName());
            return "Car - the car is accelerating";
        }

        @Override
        public String brake() {
            System.out.println(getClass().getSimpleName());
            return "the car is braking";
        }
    }
}

