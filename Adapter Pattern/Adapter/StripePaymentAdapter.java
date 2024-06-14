package Adapter Pattern.Adapter;


import Adapter Pattern.Adaptee.StripePaymentProcessor;
import Adapter Patterm.target.PaymentGateway;

public class StripePaymentAdapter implements PaymentGateway {
    public StripePaymentProcessor stripePaymentProcessor;

    StripePaymentAdapter(StripePaymentProcessor stripePaymentProcessor){
        this.stripePaymentProcessor=stripePaymentProcessor;
    }

    @Override
    public void makePayment(){
        this.stripePaymentProcessor.makePayment();
    }

    @Override
    public void getId(int Id){
        this.stripePaymentProcessor.getId(Id);
    }

}
