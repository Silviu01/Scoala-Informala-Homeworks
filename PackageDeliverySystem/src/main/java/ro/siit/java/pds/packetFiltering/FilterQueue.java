package ro.siit.java.pds.packetFiltering;

import ro.siit.java.pds.Packet;
import ro.siit.java.pds.dijkstra.City;

import java.util.Set;
import java.util.TreeSet;

/**
 * Here packages are sorted alphabetically
 */

public class FilterQueue {
    private Set<Packet> deliveryQueue = new TreeSet<>(new DestinationComparator());
    private Set<Packet> transportQueue = new TreeSet<>(new DestinationComparator());


    //    atunci cand pachetul ajunge intr-un facility, daca destinatia e aceesi cu facilitiul in care ajunge,
    // merge la delivery, daca daca destinatia difera, o sa mearga la transport queue de fiecare data

    public void addPackageInQueue(Packet packet, City facility) {
        if (packet.getDestination().getAddress().getCity().getName().equals(facility.getName())) {
            deliveryQueue.add(packet);
        } else {
            transportQueue.add(packet);
        }

    }
    /**
     * Removes from a queue a package to be lifted by a truck or a van
     */

    public void removeFromDeliveryQueue(Packet packet) {
        deliveryQueue.remove(packet);
    }

    public void removeFromTransportQueue(Packet packet) {
        transportQueue.remove(packet);
    }

    public Set<Packet> getDeliveryQueue() {
        return deliveryQueue;
    }

    public Set<Packet> getTransportQueue() {
        return transportQueue;
    }

}