import java.util.Arrays;
import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1,2,3,4,5,6};
        System.out.println("n: ");
        int n = sc.nextInt();
        int count =0;
        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] == n){
                count++;
            }
        }
        if (count == 0){
            System.out.println("nqma takova chislo");

        }

        else{
            int newSize=arr1.length-count;
            int[] arr2 = new int[newSize];
            int currInd= 0;
            for (int i = 0; i< arr1.length; i++){
                if (arr1[i] != n){
                    arr2[currInd] = arr1[i];
                    currInd++;
                }
            }
            System.out.println(Arrays.toString(arr2));
        }



    }
}
