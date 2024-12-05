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
class DomesticShipment extends shipment{
    private String region;
    private double shipmentCost;
    public DomesticShipment(String shipmentId, double weight, String destination, String region, double shipmentCost ){
        super(shipmentId, weight, destination);
        this.region = region;
        this.shipmentCost = shipmentCost;
    }
}
class InternationalShipment extends shipment{
    private String region;
    private double shipmentCost;
    public InternationalShipment(String shipmentId, double weight, String destination, String region, double shipmentCost ){
        super(shipmentId, weight, destination);
        this.region = region;
        this.shipmentCost = shipmentCost;
    }
}

public class LogisticsIndustry{
    public static void main(String[] args) {
        DomesticShipment dShipment = new DomesticShipment();
        InternationalShipment inShipment = new InternationalShipment();

    }
}