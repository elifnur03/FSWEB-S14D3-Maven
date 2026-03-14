package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() { return avgKmPerCharge; }
    public int getBatterySize() { return batterySize; }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " - electric motor starting, battery: " + batterySize + " kWh";
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + " - driving on electric, " + avgKmPerCharge + " km/charge";
    }

    @Override
    protected String runEngine() {
        return getClass().getSimpleName() + " - electric motor running";
    }
}
