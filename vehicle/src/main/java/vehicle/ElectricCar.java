package vehicle;



public class ElectricCar extends Car {
    private double milesOnMaxCharge;
    private double currentCharge;
    /** Note: Car begins with a full charge (and thus range).
    @throws IllegalArgumentException if milesOnMaxCharge is nonpositive.*/
    public ElectricCar(String make, String model, double startingMileage, double milesOnMaxCharge){
        super(make, model, startingMileage);
        if(milesOnMaxCharge<=0){
            throw new IllegalArgumentException();
        }
        this.startingMileage = startingMileage;
        this.milesOnMaxCharge = milesOnMaxCharge;
        this.miles = miles;
    }

    /** Defaults mileage to 0.
    @throws IllegalArgumentException if milesOnMaxCharge is nonpositive.*/
    public ElectricCar (String make, String model, double milesOnMaxCharge){
        super(make, model);
        if(startingMileage<=0){
            throw new IllegalArgumentException();
        }
        this.startingMileage = startingMileage;
        this.milesOnMaxCharge = milesOnMaxCharge;
        this.miles = miles;
    }

    /** Drives the full given number of miles.
    @throws IllegalArgumentException if miles is negative.
    @throws IllegalArgumentException if miles is too high given the
    current charge.*/
    public void drive(double miles){
        if(miles<0 || miles> currentCharge){
            throw new IllegalArgumentException();
        }
    }

    /** Returns how many more miles the car can currently go without recharging. */
    public double getRemainingRange(){
        return 3.4;
    }

    /** Returns how many miles the car could go on a full charge. */
    public double getMaxRange(){
        return 3.4;
    }

    /** Recharges the car to max range capability. */
    public void recharge(){

    }

    /** Decreases the amount of energy in the battery based by the number of miles passed as an argument. */
    protected void decreaseCharge(double miles){
        
    }

}
