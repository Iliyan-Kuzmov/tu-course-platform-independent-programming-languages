import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        double a = sc.nextDouble();
        if (100 <= a && a <= 200) {
            System.out.println("Yes");
        }
        else {
            System.out.println("Invalid");
        }

    }
}
