package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {}

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }

    public String startEngine() {
        return getClass().getSimpleName() + " - engine starting";
    }

    public String drive() {
        runEngine();
        return getClass().getSimpleName() + " - driving";
    }

    protected String runEngine() {
        return getClass().getSimpleName() + " - engine running";
    }
}