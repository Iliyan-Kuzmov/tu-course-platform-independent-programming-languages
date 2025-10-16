import java.util.Scanner;

public class zad18 {
    public static long fac(int a){
        if (a<0){
            return 0;
        }
        long res= 1;
        for (int i = 2; i < a+1; i++){
            res*=i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n: ");
        int n=sc.nextInt();
        System.out.println("k: ");
        int k=sc.nextInt();
        long facN = fac(n);
        long facK = fac(k);
        long facNK = fac(n-k);
        double res =  facN * facK / facNK;
        System.out.println("Result= " + res);

    }
}
