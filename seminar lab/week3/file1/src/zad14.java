import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n: ");
        int n =  sc.nextInt();
        if (n%10 != 0){
            while(true){
                System.out.println("Try again n: ");
                int curr = sc.nextInt();
                if (curr%10 == 0){
                    break;
                }
            }
        }
        System.out.println("Bravo");
    }
}
