package Adapter Pattern.Adapter;

import Adapter Pattern.Adaptee.RazorPaymentProcessor;
import Adapter Patterm.target.PaymentGateway;
public class RazorPaymentAdapter implements PaymentGateway {
    
    public RazorPaymentProcessor razorPaymentProcessor;

    RazorPaymentAdapter(RazorPaymentProcessor razorPaymentProcessor){
        this.razorPaymentProcessor=razorPaymentProcessor;
    }

    @Override
    public void makePayment(){
        this.razorPaymentProcessor.makePayment();
    }

    @Override
    public void getId(int Id){
        this.razorPaymentProcessor.getId(Id);
    }
}
