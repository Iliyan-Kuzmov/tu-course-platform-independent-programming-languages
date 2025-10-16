import java.util.Arrays;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        System.out.print(Arrays.toString(arr));
    }
}
