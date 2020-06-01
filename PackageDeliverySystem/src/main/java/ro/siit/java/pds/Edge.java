package ro.siit.java.pds;

public class Edge {

    public City targetCity;
    public double weight;

    public Edge(City cityName, double edgeWeight) {
        targetCity = cityName;
        weight = edgeWeight;
    }

    public City getTargetCity() {
        return targetCity;
    }

    public double getWeight() {
        return weight;
    }
}
