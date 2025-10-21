public class Bike extends Vehicle {

    public Bike(String make, String model, double rentalPrice)
    {
        super(make,model,rentalPrice);

    }

    @Override
    public String toString() {
        return "Bike {" +
                "make='" + this.getMake() + '\'' +
                ", model='" + this.getModel() + '\'' +
                ", rentalPrice=" + this.getRentalPrice() +
                '}';
    }
}
