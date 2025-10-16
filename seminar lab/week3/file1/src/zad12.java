import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            int curr = sc.nextInt();
            sum  += curr;
        }
        System.out.println("Sum: "+sum);
    }
}
