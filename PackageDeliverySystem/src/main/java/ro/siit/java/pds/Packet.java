package ro.siit.java.pds;

public class Packet {
    private int trackingID;
    private ContactInfo sender;
    private ContactInfo destination;

    public int getTrackingID() {
        return trackingID;
    }


    public Packet(int trackingID, ContactInfo sender, ContactInfo destination) {
        this.trackingID = trackingID;
        this.sender = sender;
        this.destination = destination;
    }




}
