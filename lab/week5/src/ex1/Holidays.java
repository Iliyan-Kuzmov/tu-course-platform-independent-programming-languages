package ex1;

public class Holidays extends Journey{
    String hotelName;
    public Holidays(){
        super();
        this.hotelName = "";
    }
    public Holidays(String destination, int days, int price, String hotelName){
        super();
        this.hotelName = hotelName;
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    @Override
    public int fixPrice(int price){
        price *= 1.4;
        return price;
    }
}
