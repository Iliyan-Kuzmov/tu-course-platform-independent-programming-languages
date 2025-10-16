import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Day of week: ");
        String a = sc.nextLine();
        switch(a){
            case "Monday":
                System.out.println("Workday");
                break;
                case "Tuesday":
                    System.out.println("Workday");
                    break;
                    case "Wednesday":
                        System.out.println("Workday");
                        break;
                        case "Thursday":
                            System.out.println("Workday");
                            break;
                            case "Friday":
                                System.out.println("Workday");
                                break;
                                case "Saturday":
                                    System.out.println("Weekend");
                                    break;
                                    case "Sunday":
                                        System.out.println("Weekend");
            default:
                System.out.println("Error");
        }
    }
}
