package ro.siit.java.pds.packetFiltering;

import ro.siit.java.pds.Packet;

import java.util.Comparator;

public class DestinationComparator implements Comparator<Packet> {

    @Override
    public int compare(Packet p1, Packet p2) {
        return p1.getDestination().getAddress().getCity().getName().compareTo(p2.getDestination().getAddress().getCity().getName());
    }
}
