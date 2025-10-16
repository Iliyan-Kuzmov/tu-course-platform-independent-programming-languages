import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a =  sc.nextInt();
        if (-100<=a && a<=100 && a != 0) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
