package ex3;
import ex3.IsLandVehicle;
import ex3.Vehicle;

public class Car extends Vehicle implements IsLandVehicle{
    int power;
    public Car(int maxSpeed, String model, double price,int power){
        super();
        this.power = power;
    }
    @Override
    public double checkPromo(){
        return getPrice()*power;
    }
    @Override
    public void enterLand(){
        System.out.println("Entering land");
    }

}
