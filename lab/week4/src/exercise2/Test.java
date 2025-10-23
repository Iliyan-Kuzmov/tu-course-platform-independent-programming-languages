package exercise2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Georgi", "Georgiev", "01.01.1999", "121224195", 4.0,4.0,4.0);
        student.displayInfo();
        student.changeGrade("PPE", 6.00);
        student.displayInfo();
    }
}
