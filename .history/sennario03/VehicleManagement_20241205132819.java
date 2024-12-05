package samplepackge;

// Base abstract class BaseVehicle
abstract class BaseVehicle {
    private double distance; // in kilometers
    private double weight;   // in kilograms

    public BaseVehicle(double distance, double weight) {
        this.distance = distance;
        this.weight = weight;
    }
//Getters and Setters
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Abstract method to calculate cost
    public  double calculateCost(){
        return 0.0;
    };
}

// Subclass Truck
class Truck extends BaseVehicle {
    public Truck(double distance, double weight) {
        super(distance, weight);
    }

    @Override
    public double calculateCost() {
        return getDistance() * 5 + getWeight() * 2;
    }
}

// Subclass Ship
class Ship extends BaseVehicle {
    public Ship(double distance, double weight) {
        super(distance, weight);
    }

    @Override
    public double calculateCost() {
        return getDistance() * 3 + getWeight() * 1.5;
    }
}

// Subclass Airplane
class Airplane extends BaseVehicle {
    public Airplane(double distance, double weight) {
        super(distance, weight);
    }

    @Override
    public double calculateCost() {
        return getDistance() * 10 + getWeight() * 5;
    }
}

// Main class to demonstrate polymorphism
public class VehicleManagement {
    public static void main(String[] args) {
        // Create a list of BaseVehicle objects
        BaseVehicle[] vehicles = {
            new Truck(3500, 4500),
            new Ship(14000, 19000),
            new Airplane(35000, 50000)
        };

        // Calculate and display transport cost for each vehicle
        for (BaseVehicle vehicle : vehicles) {
            System.out.println("Transport cost for " + vehicle.getClass().getSimpleName() +
                               ": Rs." + vehicle.calculateCost());
        }
    }
}
