package vehicle;

abstract class GasPoweredCar extends Car{
    private String make;
    private String model; 
    private double startingMileage;
    private double mpg;
    private double fuelCapacityGallons;
    private double fuelLevel;

    public GasPoweredCar(String make, String model, double startingMileage, double mpg, double fuelCapacityGallons) {
        if(mpg < 0 || fuelCapacityGallons < 0) {
            throw new IllegalArgumentException();
        }
        super.Car(make, model, startingMileage);
        this.mpg = mpg;
        this.fuelCapacityGallons = fuelCapacityGallons;
        this.fuelLevel = fuelCapacityGallons;
    }
    
    public GasPoweredCar(String make, String model, double mpg, double fuelCapacityGallons) {
        if(mpg < 0 || fuelCapacityGallons < 0) {
            throw new IllegalArgumentException();
        }
        super.Car(make, model);
        this.mpg = mpg;
        this.fuelCapacityGallons = fuelCapacityGallons;
        this.fuelLevel = fuelCapacityGallons;
    }
    
    public void drive(double miles) {
        if(miles < 0 || miles / mpg > fuelLevel) { 
            throw new IllegalArgumentException();
        }

    }

    public double getMPG() {
        return mpg;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getFuelCapacity() {
        return fuelCapacityGallons;
    }

    public void refillTank() {
        fuelLevel = fuelCapacityGallons;
    }

    public double getRemainingRange() {
        return fuelLevel * mpg;
    }
}
