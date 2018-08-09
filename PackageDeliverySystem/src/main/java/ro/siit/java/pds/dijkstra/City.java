package ro.siit.java.pds.dijkstra;

import ro.siit.java.pds.cars.SmallCar;
import ro.siit.java.pds.cars.Truck;
import ro.siit.java.pds.cars.Van;
import ro.siit.java.pds.contactDetails.ContactInfo;
import ro.siit.java.pds.Packet;
import ro.siit.java.pds.cars.Vehicle;
import ro.siit.java.pds.packetFiltering.FilterQueue;

import java.util.List;

//FACILITY
public class City implements Comparable<City> {

    private String name;
    private double distance = Double.POSITIVE_INFINITY;
    private Edge[] adjacency;
    private City previous;

    private FilterQueue queue = new FilterQueue();
    private Vehicle pickupVehicle = new SmallCar();
    private Vehicle transportVehicle = new Truck();
    private Vehicle deliveryVehicle = new Van();

    public City(String cityName) {
        name = cityName;
    }

    public String getName() {
        return name;
    }

    public void setAdjacency(Edge[] adjacency) {
        this.adjacency = adjacency;
    }

    public City getPrevious() {
        return previous;
    }

    public double getDistance() {
        return distance;
    }

    public Edge[] getAdjacency() {
        return adjacency;
    }

    public void setPrevious(City previous) {
        this.previous = previous;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String toString() {
        return name;
    }

    public int compareTo(City other) {
        return Double.compare(distance, other.distance);
    }


//takes package from home
    public void packagePickup(Packet packet) {
        pickupVehicle.collectPackage(packet);
        pickupVehicle.deliverPackage(packet);
    }//The hand-over, pick-up and processing of packages must be done concurrently. -thread care ia pachet si proceseaza, si alt thread care face asta


//    must bring package to the facility in which arrives at that moment -> City.this



    public void addPackageToFacility(Packet packet){
        queue.addPackageInQueue(packet, City.this);
    }

    public void deliverPackage(Packet packet) {
        if(City.this.getName().equals(packet.getDestination().getAddress().getCity().getName())){
            queue.removeFromDeliveryQueue(packet);
            deliveryVehicle.collectPackage(packet);
            deliveryVehicle.deliverPackage(packet);
        }else{
            queue.removeFromTransportQueue(packet);
            transportVehicle.collectPackage(packet);
            transportVehicle.deliverPackage(packet);
        }
    }


//    public Packet packageSorting(ContactInfo deliveryContactInfo){
//
//        return null;
//    }


    //car, number, checkpoint

//
//    public Packet[] sortPackages(Packet[] someQueue) {
//        return null;
//    }
//}

}
