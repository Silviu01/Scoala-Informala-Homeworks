package ro.siit.java.pds;

public class City implements Comparable<City> {

    public String name;
    private double distance = Double.POSITIVE_INFINITY;
    private Edge[] adjacency;
    private City previous;

    public void setName(String name){
        this.name = name;
    }

    public void setAdjacency(Edge[] adjacency) {
        this.adjacency = adjacency;
    }

    public City getPrevious() {
        return previous;
    }

    public double getDistance() {
        return distance;
    }

    public Edge[] getAdjacency() {
        return adjacency;
    }

    public void setPrevious(City previous) {
        this.previous = previous;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public City(String cityName) {
        name = cityName;
    }

    public String toString() {
        return name;
    }

    public int compareTo(City other) {
        return Double.compare(distance, other.distance);
    }
}
