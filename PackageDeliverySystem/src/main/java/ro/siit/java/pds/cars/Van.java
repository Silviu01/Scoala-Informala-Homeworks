package ro.siit.java.pds.cars;

import ro.siit.java.pds.Packet;

import java.util.ArrayList;
import java.util.List;

public class Van implements Vehicle {
    private int carNumber = 21;
    private List<Packet> packagesInCar = new ArrayList<>();

//    public Van(int carNumber) {
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
        return "The delivery car has taken the package";
    }

    @Override
    public String leftPackage() {
        return "The delivery car has delivered the package";
    }


}
