package exercise4;

public class Test {
    public static void main(String[] args) {
        Multiprocessor mp1 = new Multiprocessor(2, 32,2.4);
        System.out.println(mp1);
        double equivalent = mp1.calculateClock();
        System.out.println("Equivalent: "+equivalent + "GHz");
        double multiExecutionTime = mp1.calculateExecution(120, 2.4);
        System.out.println("MultiExecutionTime: "+multiExecutionTime + "s");
        mp1.toString();
    }




}
