package ro.siit.java.pds;

public class Facility {

    private String facility;  //ar trebui sa fie acelasi cu orasul din care e preluat, si mai departe cu restul oraselor prin care trece
    Vehicle pickupVehicle;
    Vehicle deliveryVehicle;
    Vehicle transportVehicle;

    public Packet packageFiltering(Vehicle pickupVehicle, Vehicle transportVehicle){

        return null;
    }

    public Packet packageSorting(ContactInfo deliveryContactInfo){

        return null;
    }

    public Packet packagePickup(){
        return null;
    }//The hand-over, pick-up and processing of packages must be done concurrently. 


    //car, number, checkpoint
}


