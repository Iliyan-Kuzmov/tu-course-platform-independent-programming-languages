package ex3;


public abstract class Vehicle{
    int maxSpeed;
        String model;
        double price;
        public Vehicle(){
            this.maxSpeed = 0;
            this.model = "";
            this.price = 0;
        }
        public Vehicle(int maxSpeed, String model, double price){
            this.maxSpeed = maxSpeed;
            this.model = model;
            this.price = price;
        }
        public int getMaxSpeed(){
            return this.maxSpeed;
        }
        public String getModel(){
            return this.model;
        }
        public double getPrice(){
            return this.price;
        }
        public void setMaxSpeed(int maxSpeed){
            this.maxSpeed = maxSpeed;
        }
        public void setModel(String model){
            this.model = model;
        }
        public void setPrice(double price){
            this.price = price;
        }
        public abstract double checkPromo();
    }


