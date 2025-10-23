package exercise1;

public class Test {
    public static void main(String[] args) {
        Course bel = new Course("Bulgarian");
        Course math = new Course("Math");
        System.out.println("Current courses: " + bel.getNameCourse() + ", " + math.getNameCourse());
        Course english = new Course("English");
        Teacher teacher1 = new Teacher("Ivan", english);
        System.out.println("Current teachers: " + teacher1.getCourse().getNameCourse());

    }
}
