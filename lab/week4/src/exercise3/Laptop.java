package exercise3;

public class Laptop extends Device{
    private int ramSize;
    private int hardDiskSize;
    public Laptop(){
        super();
        this.ramSize = 0;
        this.hardDiskSize = 0;
    }
    public Laptop(double voltage, String modelCPU, boolean isTurnedOn, int ramSize, int hardDiskSize){
        super(voltage, modelCPU, isTurnedOn);
        this.ramSize = ramSize;
        this.hardDiskSize = hardDiskSize;
    }
    public int getRamSize(){
        return this.ramSize;
    }
    public int getHardDiskSize(){
        return this.hardDiskSize;
    }
    public void setRamSize(int ramSize){
        this.ramSize = ramSize;
    }
    public void setHardDiskSize(int hardDiskSize){
        this.hardDiskSize = hardDiskSize;
    }
    public boolean isBetter(Laptop laptop2){
        return this.ramSize > laptop2.ramSize && this.hardDiskSize > laptop2.hardDiskSize;
    }
    public String toString(){
        return "CPU: " + super.getModelCPU() + "\n" +
                "Voltage: " + super.getVoltage() + "\n" +
                "On/Off: " + super.getIsTurnedOn() + "\n" +
                "RAM: " + getRamSize() + "\n"+
                "Hard Disk: " + getHardDiskSize();
    }
}
