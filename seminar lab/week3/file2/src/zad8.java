import java.util.Arrays;

public class zad8 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,8,3,7,5};
        int[] nov = new int[3];
        int currInd = 0;
        for  (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if  (arr1[i] == arr2[j]) {
                    nov[currInd] = arr1[i];
                    currInd++;
                }
            }
        }
        System.out.println(Arrays.toString(nov));

    }
}
