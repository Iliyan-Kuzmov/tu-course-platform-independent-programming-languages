package exercise4;

public class Multiprocessor {
    private int cpus;
    private int cores;
    private double clock;
    public Multiprocessor(){
        this.cpus = 0;
        this.cores = 0;
        this.clock = 0;
    }
    public Multiprocessor(int cpus, int cores, double clock){
        this.cpus = cpus;
        this.cores = cores;
        this.clock = clock;
    }
    public int getCpus() {
        return cpus;
    }
    public void setCpus(int cpus) {
        if (cpus < 1){
            System.out.println("cpus smaller than 1");
            return;
        }
        this.cpus = cpus;
    }
    public int getCores() {
        return cores;
    }
    public void setCores(int cores) {
        if (cores < 1){
            System.out.println("cores smaller than 1");
            return;
        }
        this.cores = cores;
    }
    public double getClock() {
        return clock;
    }
    public void setClock(double clock) {
        if (clock <= 0){
            System.out.println("clock smaller than 1");
            return;
        }
        this.clock = clock;
    }
    public double calculateClock(){
        double coreCoef = 1.0;
        double cpuCoef = 1.0;
        if (cores>1){
            coreCoef = 0.7;
        }
        if (cpus>1){
            cpuCoef = 0.8;
        }
        return coreCoef*cpuCoef * cpuCoef*cpus*clock;
    }
    public double calculateExecution(double t, double clock){
        double multiCpuClock =  calculateClock();
        return t*clock/multiCpuClock;

    }
    public String toString(){
        return "CPUs: "+ cpus + "\n"+
                "Cores: "+cores + "\n"+
                "Clock: "+ clock;
    }

}
