package State_Design_Pattern.v2;

public interface ATMStates {

    String init ();

    boolean cancelTxn(String txn);

    void ejectCard();

    boolean readCard(String txn,String cardType,String cardNum,String cardCVV);

    boolean readWithdrawDetails(float amount,String txn,int pin);

    boolean dispenseCash(String txn);
} 
