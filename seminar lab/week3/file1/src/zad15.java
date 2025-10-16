import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Chas: ");
        String h = sc.nextLine();
        System.out.println("Minuti: ");
        String m = sc.nextLine();
        int chas = Integer.parseInt(h);
        int minuti = Integer.parseInt(m);
        if (chas < 0 || chas > 23 || minuti< 0 || minuti > 59){
            System.out.println("Invalid input");
        }
        if (minuti >= 45){
            if (chas == 23){
                chas = 0;
                minuti = minuti+15-60;
            }else{
                chas = chas +1;
                minuti = minuti+15-60;
            }
        }
        else {
            minuti = minuti + 15;
        }
        if (minuti < 10 && chas >= 10){
            System.out.printf("Chasut sled 15 min ste bude: %d:0%d", chas, minuti);
        }
        else if(chas < 10 && minuti >= 10){
            System.out.printf("Chasut sled 15 mun ste bude: 0%d:%d", chas, minuti);
        }
        else if(minuti < 10 && chas < 10){
            System.out.printf("Chasut sled 15 min ste bude: 0%d:0%d", chas, minuti);
        }
        else{
            System.out.printf("Chasut sled 15 min ste bude: %d:%d", chas, minuti);
        }
    }
}
