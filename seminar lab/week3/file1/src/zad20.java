import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Figura: ");
        String figura = sc.nextLine();
        double area = 0;
        switch(figura){
            case "square":
                System.out.println("a: ");
                double a = sc.nextDouble();
                area = a*a;
                break;
                case "rectangle":
                    System.out.println("b: ");
                    double b = sc.nextDouble();
                    System.out.println("c: ");
                    double c = sc.nextDouble();
                    area = b*c;
                    break;
                    case "circle":
                        System.out.println("r: ");
                        double r = sc.nextDouble();
                        area = Math.PI*r*r;
                        break;
                        case "triangle":
                            System.out.println("d: ");
                            double d = sc.nextDouble();
                            System.out.println("h: ");
                            double h = sc.nextDouble();
                            area = d*h/2;
                            break;
        }
        System.out.println("Area: "+area);
    }
}
