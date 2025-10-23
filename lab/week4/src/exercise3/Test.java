package exercise3;

public class Test {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(10, "I9", false, 16, 1024);
        Laptop laptop2 = new Laptop(20, "I7", false, 32, 500);
        System.out.println("Laptop 1: ");
        System.out.println(laptop1.toString());
        System.out.println("Laptop 2: ");
        System.out.println(laptop2.toString());
        laptop1.turnOn();
        System.out.println(laptop1.toString());
        boolean better = laptop1.isBetter(laptop2);
        System.out.println(better);
    }
}
