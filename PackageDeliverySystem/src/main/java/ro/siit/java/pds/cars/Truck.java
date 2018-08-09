package ro.siit.java.pds.cars;

import ro.siit.java.pds.Packet;

import java.util.ArrayList;
import java.util.List;

public class Truck implements Vehicle {
    private int carNumber = 31;
    private List<Packet> packagesInCar = new ArrayList<>();

//    public Truck(int carNumber) {
//        this.carNumber = carNumber;
//    }

    public int getCarNumber() {
        return carNumber;
    }

    public void collectPackage(Packet packet) {
        packagesInCar.add(packet);
    }

    public void deliverPackage(Packet packet) {
        packagesInCar.remove(packet);
    }

    @Override
    public String pickedUpPackage() {
        return "The transportation car has taken the package";
    }

    @Override
    public String leftPackage() {
        return "The transportation car has brought the package";
    }


}
