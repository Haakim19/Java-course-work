package sennario02;
abstract class shipment{
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
    public Double costCalculation(){
        return 0.0;
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
    public String getRegion() {
        return region;
    }
    public double getShipmentCost() {
        return shipmentCost;
    }
    @Override
    public Double costCalculation(){
        double tex = shipmentCost * 0.05;
        return tex + shipmentCost ;
    }
}
class InternationalShipment extends shipment{
    private double customsfee;
    private double shipmentCost;
    private double insuranceFee;
    public InternationalShipment(String shipmentId, double weight, String destination, double customsFee, double shipmentCost, double insurancefee){
        super(shipmentId, weight, destination);
        this.customsFee = customsfee;
        this.shipmentCost = shipmentCost;
        this.insurancefee = insuranceFee;
    }
    public String getRegion() {
        return region;
    }
    public double getShipmentCost() {
        return shipmentCost;
    }
    @Override
    public Double costCalculation(){
        double tex = shipmentCost * 0.15;
        return tex + shipmentCost + customsfee + insuranceFee;
    }
}

public class LogisticsIndustry{
    public static void main(String[] args) {
        DomesticShipment dShipment1 = new DomesticShipment("E001", 100, "Kandy" , "Central", 12000);
        InternationalShipment inShipment1 = new InternationalShipment("A002", 200, "India", 2000,30000,1000);
        System.out.println("Domestic Shipment");
        System.out.println("Shipment Id: " + dShipment1.getShipmentId());
        System.out.println("Shipment Weight: " + dShipment1.getWeight() + "Kg");
        System.out.println("Shipment : " + dShipment1.getWeight());
    }
}