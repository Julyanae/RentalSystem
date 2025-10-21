public class Car extends Vehicle{

    public Car(String make, String model, double rentalPrice)
    {
        super(make,model,rentalPrice);
    }
    @Override
    public String toString() {
        return "Car {" +
                "make='" + this.getMake() + '\'' +
                ", model='" + this.getModel() + '\'' +
                ", rentalPrice=" + this.getRentalPrice() +
                '}';
    }

}
