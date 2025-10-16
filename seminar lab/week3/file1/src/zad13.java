import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String res="";

        while (true){
            String txt = sc.nextLine();
            if (txt.equals("Stop")){
                break;
            }
            res=res+" "+txt;
        }
        System.out.print("Result: " +res);
    }
}
