public abstract class Shape implements IShapeActions{
    String name;
    public Shape(){
        this.name = "";
    }
    public Shape(String name){
        this.name = name;
    }
    @Override
    public abstract double calculateArea();
    @Override
    public abstract double calculatePerimeter();
    @Override
    public void displayInfo() {
        System.out.println("Shape Name: " + this.name + "\n");
        System.out.println("Shape Area: " + calculateArea() + "\n");
        System.out.println("Shape Perimeter: " + calculatePerimeter() + "\n");
    }
}
