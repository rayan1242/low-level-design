package Adapter Pattern.Adaptee;

class StripePaymentProcessor{
    
        public void makePayment(){
            System.out.println("Making payment using stripe");
        }

        public void getId(int id){
            System.out.println("Getting payment status for stripe");
        }

}
