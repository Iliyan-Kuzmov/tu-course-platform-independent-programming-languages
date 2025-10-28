public class Square extends Shape{
    double a;
    public Square(){
        this.a = 1;
    }
    public Square(double a){
        this.a = a;
    }
    @Override
    public double calculateArea(){
        return a*a;
    }
    @Override
    public double calculatePerimeter(){
        return 4*a;
    }
}
