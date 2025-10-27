package ex3;

import ex3.Vehicle;

public class Hovercraft extends Vehicle implements IsSeaVessel , IsLandVehicle{
    int passengers;
    public Hovercraft(int maxSpeed, String model, double price,int passengers) {
        super();

        this.passengers = passengers;
    }
    @Override
    public double checkPromo() {
        return getPrice()*0.97;
    }
    @Override
    public void enterSea(){
        System.out.println("Entering sea");
    }
    @Override
    public void enterLand(){
        System.out.println("Entering land");
    }
}
