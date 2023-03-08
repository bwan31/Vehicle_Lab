package vehicle;
import java.util.List;

abstract class Car {
    private String make;
    private String model;
    private double startingMileage;
    private double miles;
    private double mileage;
    private List<Double> milesEachDay;

    /** Creates a car with a starting mileage on the odometer.
    @throws IllegalArgumentException if startingMileage is negative*/
    public Car(String make, String model, double startingMileage) {
        this.make = make;
        this.model = model;
        this.startingMileage = startingMileage;

        if (startingMileage < 0) {
            throw new IllegalArgumentException("Starting mileage is negative.");
        }
    }

    /** Starting mileage is 0. */
    public Car(String make, String model) {
        this.startingMileage = 0;
    }

    /** If able to drive the full given number of miles, returns true. If
    not, returns false.
    @throws IllegalArgumentException if miles is negative.*/
    public boolean canDrive(double miles) {
        // TODO
    }

    /** Drives the full given number of miles.
    @throws IllegalArgumentException if miles is negative or if miles is
    too high given the current fuel. */
    public abstract void drive(double miles) {
        // TODO
        // if (miles < 0 || miles > <current fuel>) {
            // throw new IllegalArgumentException("Car cannot drive negative miles, or cannot drive more than the current fuel.")
        // }
    }

    /** Gives String representation of Car as
    "<make and model> (<mileage> mi)"
    Mileage should be rounded to 1 decimal place. If mileage is a whole
    number, ".0" should still display.
    */
    public String toString() {
        return make + model + " (" + mileage + " mi)";
    }

    /** Returns how many miles have been driven so far (odometer). */
    public double getMileage() {
        // TODO
        return 0;
    }

    /** Returns the make of the car. */
    public String getMake() {
        return make;
    }

    /** Returns the model of the car. */
    public String getModel() {
        return model;
    }

    /** Returns how many more miles the car can currently go given the
    remaining fuel/energy reserves. */
    public abstract double getRemainingRange() {
        // TODO
    }

    /** Adds mileage to the odometer.
    @throws IllegalArgumentException if miles is negative. */
    protected void addMileage(double miles) {
        if (miles < 0) {
            throw new IllegalArgumentException("Miles cannot be negative.");
        }

        // TODO
    }

    /** The car attempts to drive, in order, each of the daily number of
    miles in the list milesEachDay. Once the car cannot drive one of the
    day’s distance, no more days are attempted. Returns the number of
    days successfully driven.
    @throws IllegalArgumentException if miles is negative for any of the
    attempted days. The exception check should occur prior to any driving
    is attempted. */
    public int roadTrip(List<Double> milesEachDay) {
        if (miles < 0) {
            throw new IllegalArgumentException("Miles cannot be negative.");
        }

        // TODO
        return 0; 
    }
}