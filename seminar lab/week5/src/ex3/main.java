package ex3;

public class main {
    public abstract class PaymentMethod{
        public abstract String processPayment();
        public void validateCredentials(){
            System.out.println("Validating");
        }
    }
    public class PayPal extends PaymentMethod{
        @Override
        public String processPayment() {
            return "Paying wwith PayPal";
        }
    }
    public class CreditCard extends PaymentMethod{
        @Override
        public String processPayment() {
            return "Credit Card Payment";
        }
    }
}
