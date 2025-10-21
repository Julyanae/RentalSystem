public class Vehicle {
    private String make;
    private String model;
    private double rentalPrice;



    public Vehicle(String make, String model, double rentalPrice) {
        this.make = make;
        this.model= model;
        this.rentalPrice=rentalPrice;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean equals(Vehicle vehicle)
    {
        if(this.make.equals(vehicle.make))
        {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.make.hashCode();
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", rentalPrice=" + rentalPrice +
                '}';
    }

}
