import java.util.Arrays;

public class zad14 {
    public static int[] rotateRightSimple(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0) {
            return arr;
        }
        int[] result = new int[n];
        System.arraycopy(arr, n - k, result, 0, k);
        System.arraycopy(arr, 0, result, k, n - k);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int[] nov = rotateRightSimple(arr, k);
        System.out.println(Arrays.toString(nov));
    }
}
