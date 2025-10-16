public class zad16 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,4};
        int countPovt = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    countPovt++;
                }
            }
        }
        int unionSize = arr1.length + arr2.length - countPovt;
        int[] union = new int[unionSize];

    }
}
