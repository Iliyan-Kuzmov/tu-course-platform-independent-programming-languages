package exercise1;

public class Teacher extends Person{
    private Course course1;
    public Teacher(){
        super();
    }
    public Teacher(String name, Course course){
        super(name);
        this.course1 = course;
    }
    public void setCourse(Course course){
        this.course1 = course;
    }
    public Course getCourse(){
        return this.course1;
    }
}

