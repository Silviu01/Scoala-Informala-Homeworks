package ro.siit.java.pds;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DijkstraTest {

    @Before
    public void setUp() throws Exception {

        City Cluj = new City("Cluj");
        City Oradea = new City("Oradea");
        City Arad = new City("Arad");
        City Brasov = new City("Brasov");
        City Timisoara = new City("Timisoara");
        City Craiova = new City("Craiova");
        City Bucuresti = new City("Bucuresti");
        City Alba = new City("Alba");
        City Valcea = new City("Valcea");
        City Sibiu = new City("Sibiu");
        City Pitesti = new City("Pitesti");
        City Ploiesti = new City("Ploiesti");
        City Mures = new City("Mures");
        City Iasi = new City("Iasi");

        Cluj.setAdjacency(new Edge[]{new Edge(Oradea, 28), new Edge(Alba, 17),
                new Edge(Mures, 20), new Edge(Iasi, 90)});
        Brasov.setAdjacency(new Edge[]{new Edge(Sibiu, 28), new Edge(Mures, 35),
                new Edge(Ploiesti, 30), new Edge(Iasi, 55)});
        Bucuresti.setAdjacency(new Edge[]{new Edge(Ploiesti, 10), new Edge(Pitesti, 17)});

        Sibiu.setAdjacency(new Edge[]{new Edge(Alba, 13), new Edge(Timisoara, 60),
                new Edge(Valcea, 16), new Edge(Brasov, 28)});
        Mures.setAdjacency(new Edge[]{new Edge(Cluj, 20), new Edge(Brasov, 35)});

        Oradea.setAdjacency(new Edge[]{new Edge(Cluj, 28), new Edge(Arad, 30)});

        Timisoara.setAdjacency(new Edge[]{new Edge(Arad, 13), new Edge(Craiova, 70), new Edge(Sibiu, 60)});

        Alba.setAdjacency(new Edge[]{new Edge(Arad, 44), new Edge(Cluj, 17), new Edge(Sibiu, 13)});

        Arad.setAdjacency(new Edge[]{new Edge(Oradea, 30), new Edge(Timisoara, 13), new Edge(Alba, 44)});

        Craiova.setAdjacency(new Edge[]{new Edge(Timisoara, 70), new Edge(Valcea, 26), new Edge(Pitesti, 25)});

        Valcea.setAdjacency(new Edge[]{new Edge(Sibiu, 16), new Edge(Craiova, 26), new Edge(Pitesti, 11)});

        Pitesti.setAdjacency(new Edge[]{new Edge(Valcea, 11), new Edge(Craiova, 25), new Edge(Bucuresti, 17), new Edge(Ploiesti, 25)});

        Ploiesti.setAdjacency(new Edge[]{new Edge(Brasov, 30), new Edge(Pitesti, 25), new Edge(Bucuresti, 10)});

        Iasi.setAdjacency(new Edge[]{new Edge(Cluj, 90), new Edge(Brasov, 55)});

        // Lets check from Cluj to Bucharest
        Dijkstra djk = new Dijkstra();
        djk.computePaths(Cluj); // runs Dijkstra
        List<City> path = djk.getShortestPathTo(Bucuresti);


        assertNotNull(path);
        assertTrue(path.size() > 0);

        System.out.println("Cost to " + Bucuresti + ": " + Bucuresti.getDistance());
        System.out.println("Path: " + path);
    }

    @Test
    public void computePaths() {
    }

    @Test
    public void getShortestPathTo() {
    }
}