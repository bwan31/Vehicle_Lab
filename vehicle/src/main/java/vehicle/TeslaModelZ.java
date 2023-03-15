package vehicle;

class TeslaModelZ extends ElectricCar implements SelfDriving{
    private int modelNum;
    public TeslaModelZ(double startingMileage, int modelNum) {
        super("Tesla", "Z", startingMileage, 340);
        this.modelNum = modelNum;
    }

    public TeslaModelZ(int modelNum) {
        this(0, modelNum);
    }

    public int getModelNum(){
        return modelNum;
    }

    public String getModel() {
        return String.format("Z%d", modelNum);
    }

    public String toString() {
        return super.getMake() + " " + getModelNum() + " (" + super.getMileage() + " mi) ";
    }

    public void driveAutonomously(double miles) {
        if(miles < 0) {
            throw new IllegalArgumentException();
        }
        drive(Math.min(miles, getMaxRange())); 
        
    }
}
