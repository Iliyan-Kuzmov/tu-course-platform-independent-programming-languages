public class zad12 {
    public static void main(String[] args) {
        String[] arr = {"edno", "dve", "tri"};
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j<arr.length; j++){
                if (arr[i].equals(arr[j])){
                    bool = true;
                    break;
                }
            }
        }
        System.out.println(bool);
    }
}
