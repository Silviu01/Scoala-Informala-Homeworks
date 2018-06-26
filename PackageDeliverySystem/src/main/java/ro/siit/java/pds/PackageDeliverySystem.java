package ro.siit.java.pds;

/*(C) copyright 2018 Silviu Ilinescu
        All rights reserved
*/

import java.util.ArrayList;
import java.util.List;

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

    /**
     * @param args
     */
    public static void main(String[] args) {

//        djk.computePaths(packages(ContactInfo(Address(new City())))); // runs Dijkstra

        List<Packet> transportQueue = new ArrayList<Packet>();
        List<Packet> deliveryQueue = new ArrayList<Packet>();

        ContactInfo sender = new ContactInfo("Silviu", new Address(new City("Cluj"), "Zorilor", "365230"), "0758496244");
        ContactInfo destination = new ContactInfo("Lucian", new Address(new City("Bucuresti"), "Eminescu", "254185"), "0754854152");
        Packet p1 = new Packet(1, sender, destination);

        transportQueue.add(p1);

        ContactInfo sender1 = new ContactInfo("Mihai", new Address(new City("Cluj"), "Zorilor", "365230"), "0754856219");
        ContactInfo destination1 = new ContactInfo("Vlad", new Address(new City("Craiova"), "Mincu", "200212"), "0742569874");
        Packet p2 = new Packet(1, sender1, destination1);
        deliveryQueue.add(p2);

//        Iterator<Packet> iterator = transportQueue.iterator();
//        while (iterator.hasNext()){
//            Packet packages = iterator.next();
//            System.out.println(packages.toString());
//
//        }

        queueInfo(transportQueue, deliveryQueue, p1);

    }

    /**
     * @param transportQueue
     * @param deliveryQueue
     * @param p1
     */
    private static void queueInfo(List<Packet> transportQueue, List<Packet> deliveryQueue, Packet p1) {
        if (transportQueue.contains(p1)) {
            System.out.println("Package is in the transport queue");
        } else if(deliveryQueue.contains(p1)){
            System.out.println("Package is in the delivery queue.");
        }else{
            System.out.println("Your package is lost.");
        }
    }


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
