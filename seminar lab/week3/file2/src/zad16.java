import java.util.Arrays;
public class zad16 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,4};
        int countSech = 0;
        int countObed = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    countSech++;
                }
            }
        }
        countObed = arr1.length - countSech;
        int[] sechenie = new int[countSech];
        int[] obedinenie = new int[countObed];
        for (int i =0 ; i< arr1.length;i++){
            for (int j =0; j<arr2.length;j++){
                for (int k = 0;k<countSech;k++){
                    if (arr1[i] == arr2[j]){
                        sechenie[k] = arr1[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(sechenie));

    }
}
