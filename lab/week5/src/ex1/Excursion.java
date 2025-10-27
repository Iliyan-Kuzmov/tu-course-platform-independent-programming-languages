package ex1;

public class Excursion extends Journey implements Nights{
    int hotelCount;
    public Excursion(){
        super();
        this.hotelCount = 0;
    }
    public Excursion(String destination, int days, int price,int hotelCount){
        super();
        this.hotelCount = hotelCount;
    }
    public int getHotelCount() {
        return hotelCount;
    }
    public void setHotelCount(int hotelCount) {
        this.hotelCount = hotelCount;
    }
    @Override
    public int fixPrice(int price){
        price *= 1.1;
        return price;
    }
    @Override
    public int calculateNights(){
        System.out.println("Nights count: ");
        return days - 2;
    }
}
