import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class System {
    private List<Packet> packages = new ArrayList<>();

    public void addPackage(Packet p){
        packages.add(p);
    }

//    grouping the packages based on the target location and delivery date.
//the methods creates a map where the key is made from targetLocation and deliveryDate and the value is a List of packages
    public Map<String, List<Packet>> groupPackages(){
        Map<String, List<Packet>> groupedPackages = new HashMap<>();
        for(Packet packet : packages){
            String key = getPackageKey(packet);
            List<Packet> packages1 = groupedPackages.computeIfAbsent(key, k -> new ArrayList<>());
            packages1.add(packet);
        }
        return groupedPackages;
    }

    private String getPackageKey(Packet packet) {
        return packet.getTargetLocation()+ packet.getDeliveryDate();
    }

    public void deliverPackages() {
        Map<String, List<Packet>> groupedPackages = groupPackages();
        for (List<Packet> packages : groupedPackages.values()) {

            new Thread(this::deliverPackages).start();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
