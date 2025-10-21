public class RentalSystem {
    public static void main(String[] args) {

        RentalAgency rentalAgency = new RentalAgency();

        Vehicle car1 = new Car("Toyota", "Corolla", 50.0);
        Vehicle car2 = new Car("Honda", "Civic", 45.0);

        Vehicle bike1 = new Bike("Yamaha", "MT-07", 30.0);
        Vehicle bike2 = new Bike("Kawasaki", "Ninja 400", 35.0);

        rentalAgency.addVehicle(car1);
        rentalAgency.addVehicle(car2);
        rentalAgency.addVehicle(bike2);
        rentalAgency.addVehicle(bike1);

        rentalAgency.getVehiclesAvailable();

        rentalAgency.rentVehicle(car1);

        rentalAgency.getVehiclesAvailable();

    }
}
