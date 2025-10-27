package ex2;

public class SickPatient extends Patient{
    String epikriza;
    String status;
    int startDate;
    SickPatient(){
        super();
        this.epikriza = "";
        this.status = "";
        this.startDate = 0;
    }
    public SickPatient(String name, String address, String egn, String epikriza, String status, int startDate){
        super();
        this.epikriza = epikriza;
        this.status = status;
        this.startDate = startDate;
    }
    public String getEpikriza() {
        return epikriza;
    }
    public void setEpikriza(String epikriza) {
        this.epikriza = epikriza;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getStartDate() {
        return startDate;
    }
    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }
    @Override
    public String cure(String medicine, int quantity) {
        epikriza= epikriza + "priemalo se" + medicine + "kolechestvo: " + quantity;
        return epikriza;
    }

    public void DisplayData(){
        super.displayData();
        System.out.println("Epikriza"+this.epikriza);
        System.out.println("Status"+this.status);
        System.out.println("StartDate"+this.startDate);
    }
}
