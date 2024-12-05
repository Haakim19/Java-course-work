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
    public double getWeight() {
        return weight;
    }
    public String getDestination() {
        return destination;
    }
    
}
public class LogisticsIndustry{
    public static void main(String[] args) {
        DomesticShipment dShipment = new DomesticShipment();
        InternationalShipment inShipment = new InternationalShipment();

    }
}