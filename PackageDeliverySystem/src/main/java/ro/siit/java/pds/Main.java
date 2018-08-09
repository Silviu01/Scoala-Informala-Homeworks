package ro.siit.java.pds;

import ro.siit.java.pds.contactDetails.Address;
import ro.siit.java.pds.contactDetails.ContactInfo;
import ro.siit.java.pds.dijkstra.City;
import ro.siit.java.pds.dijkstra.Dijkstra;
import ro.siit.java.pds.dijkstra.Edge;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<City> cities = new ArrayList<>();

        City cluj = new City("Cluj");
        City oradea = new City("Oradea");
        City arad = new City("Arad");
        City brasov = new City("Brasov");
        City timisoara = new City("Timisoara");
        City craiova = new City("Craiova");
        City bucuresti = new City("Bucuresti");
        City alba = new City("Alba");
        City valcea = new City("Valcea");
        City sibiu = new City("Sibiu");
        City pitesti = new City("Pitesti");
        City ploiesti = new City("Ploiesti");
        City mures = new City("Mures");
        City iasi = new City("Iasi");

        cluj.setAdjacency(new Edge[]{new Edge(oradea, 28), new Edge(alba, 17),
                new Edge(mures, 20), new Edge(iasi, 90)});
        brasov.setAdjacency(new Edge[]{new Edge(sibiu, 28), new Edge(mures, 35),
                new Edge(ploiesti, 30), new Edge(iasi, 55)});
        bucuresti.setAdjacency(new Edge[]{new Edge(ploiesti, 10), new Edge(pitesti, 17)});

        sibiu.setAdjacency(new Edge[]{new Edge(alba, 13), new Edge(timisoara, 60),
                new Edge(valcea, 16), new Edge(brasov, 28)});
        mures.setAdjacency(new Edge[]{new Edge(cluj, 20), new Edge(brasov, 35)});

        oradea.setAdjacency(new Edge[]{new Edge(cluj, 28), new Edge(arad, 30)});

        timisoara.setAdjacency(new Edge[]{new Edge(arad, 13), new Edge(craiova, 70), new Edge(sibiu, 60)});

        alba.setAdjacency(new Edge[]{new Edge(arad, 44), new Edge(cluj, 17), new Edge(sibiu, 13)});

        arad.setAdjacency(new Edge[]{new Edge(oradea, 30), new Edge(timisoara, 13), new Edge(alba, 44)});

        craiova.setAdjacency(new Edge[]{new Edge(timisoara, 70), new Edge(valcea, 26), new Edge(pitesti, 25)});

        valcea.setAdjacency(new Edge[]{new Edge(sibiu, 16), new Edge(craiova, 26), new Edge(pitesti, 11)});

        pitesti.setAdjacency(new Edge[]{new Edge(valcea, 11), new Edge(craiova, 25), new Edge(bucuresti, 17), new Edge(ploiesti, 25)});

        ploiesti.setAdjacency(new Edge[]{new Edge(brasov, 30), new Edge(pitesti, 25), new Edge(bucuresti, 10)});

        iasi.setAdjacency(new Edge[]{new Edge(cluj, 90), new Edge(brasov, 55)});

        cities.add(cluj);
        cities.add(oradea);
        cities.add(arad);
        cities.add(brasov);
        cities.add(timisoara);
        cities.add(craiova);
        cities.add(bucuresti);
        cities.add(alba);
        cities.add(valcea);
        cities.add(sibiu);
        cities.add(pitesti);
        cities.add(ploiesti);
        cities.add(mures);
        cities.add(iasi);


//        List<Packet> packages = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("jucatori.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        ContactInfo sender = new ContactInfo("Cluj ABC Retailer", new Address(new City("Bucuresti"), "Motilor 1", "400001"), "0744000111");
        ContactInfo destination = new ContactInfo("John Doe", new Address(new City("Cluj"), "Lunga 1", "300001"), "0745111222");
        Packet p1 = new Packet("TID123456", sender, destination);
//        packages.add(p1);

        PackageDeliverySystem pds = new PackageDeliverySystem();
        pds.printTrackingInfo(cities, p1);






//        for (City city: cities){
//
//            if (city.getName().equals(p1.getSender().getAddress().getCity().getName())){
//
//            city.packagePickup(p1);
//            city.addPackageToFacility(p1);
//
//            }
//
//        }


//        String trackID = "TI4D123456";
//        for (Packet packet : packages) {
//            if (packet.getTrackingID().equals(trackID)) {
//                pds.computePathWithDijkstra(cities, p1);
//                pds.getPathToDestination(cities, p1, djk);
//            }
//            else {
//                System.out.println("Package does not exist.");
//            }
//        }

//        pds.getPackages()


    }

}



