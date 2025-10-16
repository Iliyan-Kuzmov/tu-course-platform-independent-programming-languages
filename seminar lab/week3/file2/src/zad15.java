import java.util.Arrays;

public class zad15 {
    public static void main(String[] args) {
        int[] arr = {1,34,8,12,2};
        for (int i = 0; i<arr.length-1; i++){
            for(int j= 0; j < arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Vtoro po golemina: "+arr[arr.length-2]);
    }
}
