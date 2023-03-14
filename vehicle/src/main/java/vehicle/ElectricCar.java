package vehicle;
//here


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
        milesOnMaxCharge = this.milesOnMaxCharge;
        currentCharge = this.milesOnMaxCharge;
    }

    /** Defaults mileage to 0.
    @throws IllegalArgumentException if milesOnMaxCharge is nonpositive.*/
    public ElectricCar (String make, String model, double milesOnMaxCharge){
        super(make, model);
        if(this.milesOnMaxCharge <= 0){
            throw new IllegalArgumentException();
        }
        this.milesOnMaxCharge = milesOnMaxCharge;
        this.currentCharge = this.milesOnMaxCharge;
    }

    /** Drives the full given number of miles.
    @throws IllegalArgumentException if miles is negative.
    @throws IllegalArgumentException if miles is too high given the
    current charge.*/
    public void drive(double miles){
        if(miles<0 || miles> currentCharge){
            throw new IllegalArgumentException();
        }
        decreaseCharge(miles);
        super.addMileage(miles);
    }

    /** Returns how many more miles the car can currently go without recharging. */
    public double getRemainingRange(){
        return currentCharge;
    }

    /** Returns how many miles the car could go on a full charge. */
    public double getMaxRange(){
        return getMaxRange();
    }

    /** Recharges the car to max range capability. */
    public void recharge(){
        currentCharge = milesOnMaxCharge; // this is only for the chevrolet bird 
    }

    /** Decreases the amount of energy in the battery based by the number of miles passed as an argument. */
    protected void decreaseCharge(double miles){
        currentCharge -= miles;
    }

}
