package BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<UPIcompatibleCC> cards = new ArrayList<>();
        for(UPIcompatibleCC card:cards){
            card.UPIPayment();
        }
        List<InternationalPaymentsCompatibleCC> cards = new ArrayList<>();
        for(InternationalPaymentsCompatibleCC card:cards){
            card.InternationalPayments();
        }
    }
}