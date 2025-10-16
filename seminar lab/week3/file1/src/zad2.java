import java.util.Scanner;
public class zad2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        if (a%2 == 0){
            System.out.println("chetno");
        }
        else{
            System.out.println("nechetno");
        }


    }
}
