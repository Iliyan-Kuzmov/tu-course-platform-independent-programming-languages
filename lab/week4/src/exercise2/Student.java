package exercise2;

import exercise1.Person;

public class Student extends People{
    private String facNumber;
    private double gradePIK;
    private double gradeTE;
    private double gradePPE;
    public Student(){
        super();
        this.facNumber = "";
        this.gradePIK = 2;
        this.gradeTE = 2;
        this.gradePPE = 2;
    }
    public Student(String firstName, String lastName, String dayOfBirth,String facNumber, double gradePIK, double gradeTE, double gradePPE){
        super(firstName, lastName, dayOfBirth);
        this.facNumber = facNumber;
        this.gradePIK = gradePIK;
        this.gradeTE = gradeTE;
        this.gradePPE = gradePPE;
    }
    public String getFacNumber() {
        return facNumber;
    }
    public void setFacNumber(String facNumber) {
        this.facNumber = facNumber;
    }
    public double getGradePIK() {
        return gradePIK;
    }
    public void setGradePIK(double gradePIK) {
        this.gradePIK = gradePIK;
    }
    public double getGradeTE() {
        return gradeTE;
    }
    public void setGradeTE(double gradeTE) {
        this.gradeTE = gradeTE;
    }
    public double getGradePPE() {
        return gradePPE;
    }
    public void setGradePPE(double gradePPE) {
        this.gradePPE = gradePPE;
    }
    public void changeGrade(String course, double grade){
        switch(course){
            case "PIK":
                this.gradePIK = grade;
                System.out.println(super.getFirstName() + "gets " + grade + " for PIK");
                break;
            case "TE":
                this.gradeTE = grade;
                System.out.println(super.getFirstName() + "gets " + grade + " for TE");
                break;
                case "PPE":
                    this.gradePPE = grade;
                    System.out.println(super.getFirstName() + "gets " + grade + " for PPE");

        }

    }
    public void displayInfo(){
        System.out.println("First Name: " + super.getFirstName());
        System.out.println("Last Name: " + super.getLastName());
        System.out.println("Day of Birth: " + super.getDayOfBirth());
        System.out.println("Fac Number: " + facNumber);
        System.out.println("GradePIK: " + gradePIK);
        System.out.println("GradeTE: " + gradeTE);
        System.out.println("GradePPE: " + gradePPE);
    }

}
