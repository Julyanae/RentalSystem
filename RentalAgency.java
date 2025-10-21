import java.util.ArrayList;

public class RentalAgency {

    private ArrayList<Vehicle> vehicles;
    private ArrayList<Vehicle> vehiclesRented;
    private ArrayList<Vehicle> vehiclesAvailable;

    public RentalAgency()
    {
        this.vehicles=new ArrayList<>();
        this.vehiclesAvailable=new ArrayList<>();
        this.vehiclesRented=new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle)
    {
        this.vehicles.add(vehicle);
        this.vehiclesAvailable.add(vehicle);
        System.out.println("*********************************** "+vehicle.getClass().getSimpleName()+" successfully added ! ************************************");
    }

    public void rentVehicle(Vehicle vehicle)
    {
        if(this.vehiclesAvailable.contains(vehicle))
        {
            this.vehiclesRented.add(vehicle);
            this.vehiclesAvailable.remove(vehicle);
            System.out.println("*********************************** "+vehicle.getClass().getSimpleName()+" successfully rented ! ************************************");
        }
        else
        {
            System.out.println(vehicle.getClass().getSimpleName()+" Not available !");
        }
    }

    public void getVehiclesAvailable()
    {
        System.out.println("Here are the available vehicles:");
        for(Vehicle vehicle:this.vehiclesAvailable)
        {
            System.out.println("------------------------------------------------------------");
            System.out.println(vehicle.toString());
            System.out.println("____________________________________________________________");
        }
    }
}
