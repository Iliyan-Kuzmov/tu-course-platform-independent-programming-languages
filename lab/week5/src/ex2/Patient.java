package ex2;


    abstract class Patient{
        String name;
        String address;
        String egn;
        Patient(){
            this.name = "";
            this.address = "";
            this.egn = "";
        }
        public Patient(String name, String address, String egn) {
            this.name = name;
            this.address = address;
            this.egn = egn;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getEgn() {
            return egn;
        }
        public void setEgn(String egn) {
            this.egn = egn;
        }
        public abstract String cure(String medicine, int quantity);
        public void displayData(){
            System.out.println(this.name + " " + this.address + " " + this.egn);
        }
    }

