import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IShapeActions> shapes = new ArrayList<IShapeActions>();
        shapes.add(new Circle(5.0));
        shapes.add(new Square(5.0));
        shapes.add(new Rectangle(3.0,7.0,15.0,4.0));

        for(IShapeActions i : shapes){
            i.displayInfo();
        }
    }
}
