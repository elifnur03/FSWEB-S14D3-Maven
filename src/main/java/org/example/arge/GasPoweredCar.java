package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() { return avgKmPerLitre; }
    public int getCylinders() { return cylinders; }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " - gas engine starting with " + cylinders + " cylinders";
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + " - driving on gas, " + avgKmPerLitre + " km/litre";
    }

    @Override
    protected String runEngine() {
        return getClass().getSimpleName() + " - gas engine running";
    }
}
