import java.util.Scanner;

public class cv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println("What is your gender?");
        String gender = sc.nextLine();
        System.out.println("Where are you from?");
        String from = sc.nextLine();
        System.out.println("Where did you study?");
        String study = sc.nextLine();
        System.out.println("What is your experience");
        String experience = sc.nextLine();
        System.out.printf("My is %s, (%s), from %s. I am %d years old. I studied at %s. My experience is in %s",
                name, gender, from,age, study, experience);
    }
}
