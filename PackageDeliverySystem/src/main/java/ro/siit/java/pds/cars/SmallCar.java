package ro.siit.java.pds.cars;

import ro.siit.java.pds.Packet;

import java.util.ArrayList;
import java.util.List;

public class SmallCar implements Vehicle{
        private int carNumber = 11;
        private List<Packet> packagesInCar = new ArrayList<>();


//    public SmallCar(int carNumber) {
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
        return "The pick up car has taken the package";
    }

    @Override
    public String leftPackage() {
        return "The pick-up car has brought the package";
    }
}

