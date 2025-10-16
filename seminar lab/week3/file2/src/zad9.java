import java.util.Arrays;

public class zad9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] nov = new int[arr.length];
        int i = arr.length-1;
        for (int j = 0; j < arr.length; j++) {
            nov[j] = arr[i];
            i--;
        }
        System.out.println(Arrays.toString(nov));
    }
}
