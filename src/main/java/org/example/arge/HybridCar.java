package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = 4;
    }

    public double getAvgKmPerLitre() { return avgKmPerLitre; }
    public int getBatterySize() { return batterySize; }
    public int getCylinders() { return cylinders; }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " - hybrid engine starting, gas + electric";
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + " - driving on hybrid, " + avgKmPerLitre + " km/litre";
    }

    @Override
    protected String runEngine() {
        return getClass().getSimpleName() + " - hybrid engine running";
    }
}