import java.util.Scanner;

public class zad19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Budget: ");
        double budget=sc.nextDouble();
        System.out.println("Broi statisti: ");
        int broiStatisti = sc.nextInt();
        System.out.println("Cena obleklo za artist: ");
        double cenaOblekloChovek=sc.nextDouble();
        double cenaDekor = 0.1 * budget;
        double cenaObleklo = broiStatisti *  cenaOblekloChovek;
        if (broiStatisti>150){
            cenaObleklo *= 0.9;
        }
        double currBudget = cenaObleklo + cenaDekor;
        if (budget < currBudget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more", currBudget-budget);
        }
        else{
            System.out.println("Action");
            System.out.printf("Wingard starts filming with %.2f leva left",  budget-currBudget);
        }
    }
}
