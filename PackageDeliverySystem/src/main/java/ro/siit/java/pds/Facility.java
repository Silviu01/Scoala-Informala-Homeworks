package ro.siit.java.pds;

import java.util.List;
import java.util.Queue;

public class Facility {

//    private String facility;  //ar trebui sa fie acelasi cu orasul din care e preluat, si mai departe cu restul oraselor prin care trece
//    List<Vehicle> vehicles;
//    Vehicle deliveryVehicle;
//    Vehicle transportVehicle;
//
//
//
//    public Packet packageFiltering(Vehicle pickupVehicle, Vehicle transportVehicle){
//
//        return null;
//    }
//
//    public Packet packageSorting(ContactInfo deliveryContactInfo){
//
//        return null;
//    }
//
//    public Packet packagePickup(){
//        return null;
//    }//The hand-over, pick-up and processing of packages must be done concurrently. 
//
//    //car, number, checkpoint


//    private String name; //only name from class Address
//    private Queue<Packet> filterQueue;
//    private Queue<Packet> deliveryPickUpQueue; //trebuie declarat aici?
//    private Queue<Packet> transportPickUpQueue; //trebuie declarat aici?
//
//
//    public Facility(String name, Queue<Packet> filterQueue, Queue<Packet> deliveryPickUpQueue, Queue<Packet> transportPickUpQueue) {
//        this.name = name;
//        this.filterQueue = filterQueue;
//        this.deliveryPickUpQueue = deliveryPickUpQueue;
//        this.transportPickUpQueue = transportPickUpQueue;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Queue<Packet> getFilterQueue() {
//        return filterQueue;
//    }
//
//    public void setFilterQueue(Queue<Packet> filterQueue) {
//        this.filterQueue = filterQueue;
//    }
//
//    public Queue<Packet> getDeliveryPickUpQueue() {
//        return deliveryPickUpQueue;
//    }
//
//    public void setDeliveryPickUpQueue(Queue<Packet> deliveryPickUpQueue) {
//        this.deliveryPickUpQueue = deliveryPickUpQueue;
//    }
//
//    public Queue<Packet> getTransportPickUpQueue() {
//        return transportPickUpQueue;
//    }
//
//    public void setTransportPickUpQueue(Queue<Packet> transportPickUpQueue) {
//        this.transportPickUpQueue = transportPickUpQueue;
//    }
//
//    /**
//     * @param filterQueue is the Queue containing packages from SmallCar and Truck (packages from inside the city and from other facility)
//     * @param filterQueue is the Queue containing packages from SmallCar and Truck (packages from inside the city and from other facility)
//     * @param name is the Facility name
//     */
//    public void filterPackages(Queue<Packet> filterQueue, Facility name) {//Queue<Parcel>
//        while (filterQueue != null && !filterQueue.isEmpty()) {
//            Packet elem = filterQueue.poll();
//            ContactInfo elemContactInfo = elem.getDestination();
//            Address elemAddress = elemContactInfo.getAddress();
//            City elemCity = elemAddress.city;
//            //System.out.println(elemCity); //test
//            String facilityName = name.getName();
//            //System.out.println(facilityName); //test
//            System.out.println(elemCity.equals(facilityName));
//
//            if (elemCity.equals(facilityName)) {
//                deliveryPickUpQueue.add(elem);
//            } else {
//                transportPickUpQueue.add(elem);
//            }
//        }
//        //int dQ=deliveryPickUpQueue.size();
//        //int tQ=transportPickUpQueue.size();
//        //System.out.println(dQ+" and "+tQ);
//        //return transportPickUpQueue;
//
//    }

}


