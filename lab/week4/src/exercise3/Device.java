package exercise3;

public class Device {
    private double voltage;
    private String modelCPU;
    private boolean isTurnedOn;
    public Device(){
        this.voltage = 0.0;
        this.modelCPU = "";
        this.isTurnedOn = false;
    }
    public Device(double voltage, String modelCPU, boolean isTurnedOn){
        this.voltage = voltage;
        this.modelCPU = modelCPU;
        this.isTurnedOn = isTurnedOn;
    }
    public Double  getVoltage(){
        return this.voltage;
    }
    public String getModelCPU(){
        return this.modelCPU;
    }
    public boolean getIsTurnedOn(){
        return this.isTurnedOn;
    }
    public void setVoltage(double voltage){
        this.voltage = voltage;
    }
    public void setModelCPU(String modelCPU){
        this.modelCPU = modelCPU;
    }
    public void setTurnedOn(boolean turnedOn){
        this.isTurnedOn = turnedOn;
    }
    public void turnOn(){
        if (this.isTurnedOn == false){
            isTurnedOn = true;
            System.out.println("Turned on");
        }
    }
    public void turnOff(){
        if (this.isTurnedOn == true){
            isTurnedOn = false;
            System.out.println("Turned off");
        }
    }
}
