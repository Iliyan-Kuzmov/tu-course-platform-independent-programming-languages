import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        int min = 999999;
        int max = -999999;
        for (int i = 0; i < a; i++) {
            int curr = sc.nextInt();
            if (curr < min) {
                min = curr;
            }
            if (curr > max) {
                max = curr;
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}
