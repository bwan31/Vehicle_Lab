package vehicle;

class FordFrivolous extends GasPoweredCar implements SelfDriving, Flying {

    /** FordFrivolous has a gas tank of 20 gallons and an MPG of 23.6. */
    public FordFrivolous(double startingMileage) {
       super("Ford", "Frivolous", startingMileage, 23.6, 20);
    }

    /** Defaults mileage to 0. */
    public FordFrivolous() {
        super("Ford", "Frivolous", 0, 23.6, 20);
    }

    public void driveAutonomously(double miles) {
        if (miles < 0) {
            throw new IllegalArgumentException();
        }
        drive(Math.min(miles, getRemainingRange())); 
        super.decreaseFuelLevel(miles);

    }

    public boolean canFly(double miles) {
        if (miles < 0) {
            throw new IllegalArgumentException();
        }
        return super.getRemainingRange() >= miles * 3;
    }

    public void fly(double miles) {
        if (miles < 0 || !canFly(miles)) {
            throw new IllegalArgumentException();
        }
        super.decreaseFuelLevel(miles * 3);
    }
}
