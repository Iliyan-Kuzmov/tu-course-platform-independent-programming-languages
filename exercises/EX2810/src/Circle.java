public class Circle extends Shape{
    double r;
    public Circle(){
        this.r = 1;
    }
    public Circle(double r){
        this.r = r;
    }
    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }
    @Override
    public double calculatePerimeter() {
        return Math.PI * r *2;
    }
}
