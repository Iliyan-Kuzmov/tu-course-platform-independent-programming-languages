import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("k: ");
        int k = sc.nextInt();
        System.out.println("n: ");
        int n = sc.nextInt();
        if (k <= 1 || k >= n){
            System.out.println("Invalid");
        }
        int res=1;
        for (int i = k+1; i < n+1; i++){
            res *= i;
        }
        System.out.println("Result: "+res);
    }
}
