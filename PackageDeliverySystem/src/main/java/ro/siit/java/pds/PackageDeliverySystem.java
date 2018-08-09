package ro.siit.java.pds;

/*(C) copyright 2018 Silviu Ilinescu
        All rights reserved
*/

import ro.siit.java.pds.cars.SmallCar;
import ro.siit.java.pds.cars.Truck;
import ro.siit.java.pds.cars.Van;
import ro.siit.java.pds.contactDetails.Address;
import ro.siit.java.pds.contactDetails.ContactInfo;
import ro.siit.java.pds.dijkstra.City;
import ro.siit.java.pds.dijkstra.Dijkstra;
import ro.siit.java.pds.dijkstra.Edge;
import ro.siit.java.pds.packetFiltering.FilterQueue;

import java.sql.SQLOutput;
import java.util.*;

/**
 * A Package delivery system application that uses Dijkstra's algorithm for shortest path calculation, and gives info
 * about a package, based on the tracking ID.
 * https://docs.google.com/document/d/13blC5q-j2g7THGYIuSRByTfXtye5CxLrdg7jGTZtbk4/edit
 * Dijkstra explanation https://www.youtube.com/watch?v=XB4MIexjvY0
 *
 * Created 9-June-2018
 * @author Silviu_Ilinescu
 */

public class PackageDeliverySystem {



    public ArrayList<Packet> getPackages() {
        FilterQueue filterQueue = new FilterQueue();
//        pentru fiecare pachet din delivery queue,
// daca transport queue nu contine pachetu, atunci il adauga, si daca il contine, atunci il trimite la destinatar ar trebui
        for (Packet packet : filterQueue.getDeliveryQueue()) {
            if (!filterQueue.getTransportQueue().contains(packet)) {
                filterQueue.getTransportQueue().add(packet);
            }
        }
        return new ArrayList<>(filterQueue.getTransportQueue());
    }

    public void printTrackingInfo(List<City> cities, Packet packet) {
        Dijkstra djk = new Dijkstra();
        for (City city : cities) {
            if (city.getName().equals(packet.getSender().getAddress().getCity().getName())) {
                djk.computePaths(city);
                System.out.println("Package picked up from: " + city.getName());
                SmallCar sc = new SmallCar();
                System.out.println(sc.pickedUpPackage());
                System.out.println(sc.leftPackage() + " to "+ city.getName()+ " Facility");
//                System.out.println("Package entered " + city.getName()+ " Delivery Facility");
//                System.out.println("Package departed " + city.getName() + " Delivery Facility");
            }
        }
        for (City city : cities) {
            if (city.getName().equals(packet.getDestination().getAddress().getCity().getName())) {
                List<City> path = djk.getShortestPathTo(city);
                System.out.println("Cost to " + city + ": " + city.getDistance());
                System.out.println("Path: " + path);
                int i = 0;
                while (i < path.size()) {
                    if(!path.get(i).getName().equals(packet.getDestination().getAddress().getCity().getName())){
                        Truck t = new Truck();

                        System.out.println("Package entered " + path.get(i) + " Delivery Facility");
                        System.out.println("Package departed " + path.get(i) + " Delivery Facility");
                        System.out.println(t.pickedUpPackage() + " from " + path.get(i) + " Facility");
                        System.out.println(t.leftPackage() + " to " + path.get(i+1) + " Facility");
                        //TODO ++i
                    }
                    else{
                        System.out.println("Package entered " + path.get(i) + " Delivery Facility");
                        System.out.println("Package departed " + path.get(i) + " Delivery Facility");
                        Van van = new Van();
                        System.out.println(van.pickedUpPackage()+ " from " + path.get(i) + " Facility");
                        System.out.println(van.leftPackage()+ " to destination");
                    }
                    i++;
                }
                System.out.println("Package delivered to: " + packet.getDestination().getContactName());
                path.clear();
            }
        }
    }
//TODO
//    private Packet getPackageByTrackingId(String trackingId) {
//        for (Packet p : packages) {
//            if (p.getTrackingID().equals(trackingId)) {
//                return p;
//            }
//        }
//
//        return null;
//    }




    /**
     * TODO
     *
     * @param pickupContactInfo
     * @param deliveryContactInfo
     * @return the tracking id of the delivery
     */

    public String requestDelivery(ContactInfo pickupContactInfo, ContactInfo deliveryContactInfo) {
        return null;
    }

    /**
     * TODO
     *
     * @param trackingID
     * @return
     */

    public TrackingInfo getTrackingInfo(String trackingID) {

        return null;
    }

    /**
     * TODO
     *
     * @param admin
     * @return
     */

    public Packet getPackage(Administrator admin) {
        return null;
    }
    //throws unauthorized access

}
