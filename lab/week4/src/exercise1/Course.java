package exercise1;

public class Course {
    private String nameCourse;
    public Course(){
        this.nameCourse = "";
    }
    public Course(String nameCourse){
        this.nameCourse = nameCourse;
    }
    public String getNameCourse(){
        return nameCourse;
    }
    public void setNameCourse(String nameCourse){
        this.nameCourse = nameCourse;
    }

}
