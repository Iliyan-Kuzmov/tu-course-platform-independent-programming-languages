package ex1;
import ex1.Nights;

public class Main {
    public static void main(String[] args) {
        Excursion sofia = new Excursion("Sofia", 6, 1000, 3);
        int finalPrice = sofia.fixPrice(sofia.getPrice());
        int nights = sofia.calculateNights();
        Holidays burgas = new Holidays("burgas",5,2000,"ABV");
        int finalPrice2 = burgas.fixPrice(burgas.getPrice());


    }
}
