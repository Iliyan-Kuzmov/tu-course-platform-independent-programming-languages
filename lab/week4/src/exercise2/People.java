package exercise2;

public class People {
    private String firstName;
    private String lastName;
    private String dayOfBirth;
    public People(){
        this.firstName = "";
        this.lastName = "";
        this.dayOfBirth = "";
    }
    public People(String firstName, String lastName, String dayOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getDayOfBirth(){
        return dayOfBirth;
    }
    public void setDayOfBirth(String dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }

}
