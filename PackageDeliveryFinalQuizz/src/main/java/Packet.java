public class Packet {

    private String targetLocation;
    private String targetDistance;
    private String packageValue;
    private String  deliveryDate;
    private static final int PRICE = 1;



    public Packet(String targetLocation, String targetDistance, String packageValue, String deliveryDate) {
        this.targetLocation = targetLocation;
        this.targetDistance = targetDistance;
        this.packageValue = packageValue;
        this.deliveryDate = deliveryDate;
    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public String getTargetDistance() {
        return targetDistance;
    }

    public String getPackageValue() {
        return packageValue;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public int calculateRevenue(){
        return Integer.parseInt(targetDistance) * PRICE;
    }

}
