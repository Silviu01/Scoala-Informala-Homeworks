package ro.siit.java.pds;

import ro.siit.java.pds.contactDetails.ContactInfo;

import java.util.HashMap;
import java.util.Map;

public class Packet {
    private String trackingID;  // poate random
    private ContactInfo sender;
    private ContactInfo destination;

    public Packet(String trackingID, ContactInfo sender, ContactInfo destination) {
        this.trackingID = trackingID;
        this.sender = sender;
        this.destination = destination;
    }

    public ContactInfo getSender() {
        return sender;
    }

    public ContactInfo getDestination() {
        return destination;
    }

    public String getTrackingID() {
        return trackingID;
    }

}
