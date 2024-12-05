package sennario02;
class shipment{
    private String shipmentId;
    private double weight;
    private String destination;

    public shipment(String shipmentId, double weight, String destination){
        this.shipmentId = shipmentId;
        this.weight = weight;
        this.destination = destination;
    }
    public String getShipmentId() {
        return shipmentId;
    }
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
}
public class LogisticsIndustry{
    public static void main(String[] args) {
        DomesticShipment dShipment = new DomesticShipment();
        InternationalShipment inShipment = new InternationalShipment();

    }
}