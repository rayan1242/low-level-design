package Adapter Pattern.Adaptee;

class RazorPaymentProcessor{
    
        public void makePayment(){
            System.out.println("Making payment using razorpay");
        }

        public void getId(int id){
            System.out.println("Getting payment status for razorpay");
        }

}
