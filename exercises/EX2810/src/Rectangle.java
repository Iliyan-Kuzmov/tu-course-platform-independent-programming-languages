public class Rectangle extends Shape{
    double a;
    double b;
    double c;
    double h;
    public Rectangle(){
        this.a = 1;
        this.b = 1;
        this.c = 1;
        this.h = 1;
    }
    public Rectangle(double a, double b, double c,double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    @Override
    public double calculateArea(){
        return a*h/2;
    }
    @Override
    public double calculatePerimeter(){
        return a+b+c;
    }
}
