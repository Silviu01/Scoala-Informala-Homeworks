package ro.siit.java.pds.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {

    /**
     * @param source
     *
     */
    public void computePaths(City source) {   //to make method for checking input
        source.setDistance(0);
        PriorityQueue<City> queue = new PriorityQueue<City>();
        queue.add(source);
        while (!queue.isEmpty()) {
            City nearestCity = queue.poll();
            if (nearestCity != null) {
                getNearestCities(queue, nearestCity);
            } else {
                System.out.println("No city selected!");
            }
        }
    }

    /**
     * @param queue
     * @param nearestCity
     */
    private void getNearestCities(PriorityQueue<City> queue, City nearestCity) {
        for (Edge e : nearestCity.getAdjacency()) {       // Visit each edge exiting nearestCity
            City nextCity = e.getTargetCity();           //takes from Edge
            double temp = nearestCity.getDistance() + e.weight;
            if (temp < nextCity.getDistance()) {
                queue.remove(nextCity);
                nextCity.setDistance(temp);
                nextCity.setPrevious(nearestCity);
                queue.add(nextCity);
            }
        }
    }

    /**
     * @param
     * @return
     */
    public List<City> getShortestPathTo(City name) {
        List<City> path = new ArrayList<City>();
        for (City city = name; city != null; city = city.getPrevious()) {
            path.add(city);
        }
        Collections.reverse(path);
        return path;
    }
}


