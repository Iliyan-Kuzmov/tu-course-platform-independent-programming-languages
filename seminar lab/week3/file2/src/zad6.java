import java.util.Scanner;

public class zad6 {
    public static int ind(int[] arr, int n){
        int found = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n){
                found = i;
            }
        }
        return found;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 4, 3, 2, 1};
        int n  = sc.nextInt();
        int index = ind(arr, n);
        System.out.println(index);
    }
}
