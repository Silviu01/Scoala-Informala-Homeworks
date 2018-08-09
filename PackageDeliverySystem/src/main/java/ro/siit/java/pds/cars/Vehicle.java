package ro.siit.java.pds.cars;

import ro.siit.java.pds.Packet;

import java.util.ArrayList;
import java.util.List;

public interface Vehicle {

//    private String driverPhone;
//    private int sizeLimit;

//    public Vehicle(int carNumber, int sizeLimit) {
//        this.sizeLimit = sizeLimit;
//        this.carNumber = carNumber;
//    }

//    public int getSizeLimit() {
//        return sizeLimit;
//    }

    public int getCarNumber();

    public void collectPackage(Packet packet);

    public void deliverPackage(Packet packet);

    public String pickedUpPackage();
    public String leftPackage();
}


