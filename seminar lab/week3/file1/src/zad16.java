import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        int a = sc.nextInt();
        if (a>=1 && a%5 == 0){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
