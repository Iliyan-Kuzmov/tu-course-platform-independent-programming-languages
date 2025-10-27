package ex3;
import ex3.Vehicle;
import ex3.IsSeaVessel;

public class Ship extends Vehicle implements IsSeaVessel {
    int deadweight;
    public Ship(int maxSpeed, String model, double price,int deadweight) {
        super();
        this.deadweight = deadweight;
    }
    @Override
    public double checkPromo() {
        return getPrice()*0.997;
    }
    @Override
    public void enterSea(){
        System.out.println("Entering sea");
    }
}
