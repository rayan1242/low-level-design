package Adapter Pattern.target;

import Adapter Pattern.Adaptee.StripePaymentProcessor;
import Adapter Pattern.Adaptee.RazorPaymentProcessor;

import Adapter Pattern.Adapter.StripePaymentAdapter;
import Adapter Pattern.Adapter.RazorPaymentAdapter;

class Main{
    public static void main(String[] args) {
        RazorPaymentProcessor razorPaymentProcessor=new RazorPaymentProcessor();
        RazorPaymentAdapter ra=new RazorPaymentAdapter(RazorPaymentProcessor razorPaymentProcessor);
        ra.makePayment();
        ra.getId(int Id);

        StripePaymentProcessor stripePaymentProcessor=new StripePaymentProcessor();
        StripePaymentAdapter sa=new StripePaymentAdapter(StripePaymentProcessor stripePaymentProcessor);
        sa.makePayment();
        sa.getId(int Id);

    }
}