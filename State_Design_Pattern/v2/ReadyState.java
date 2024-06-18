package State_Design_Pattern.v2;

import State_Design_Pattern.v2.ATM;

import java.util.UUID;

public class ReadyState implements ATMStates{
    private final ATM atm;

    public ReadyState(ATM atm){
        this.atm=atm;
    }

    @Override
    public String init (){
        String txn=UUID.randomUUID().toString();
        this.atm.changeState(new CardReadingState(this.atm));
        return null;
    }

    @Override
    public boolean cancelTxn(String txn){
        throw new IllegalArgumentException("NO transaction in process");
    }

    @Override
    public void ejectCard(){
        return ;
    }

    @Override
    public boolean readCard(String txn,String cardType,String cardNum,String cardCVV){
        return true;

    }

    @Override
    public boolean readWithdrawDetails(float amount,String txn,int pin){
        return true;

    }

    @Override
    public boolean dispenseCash(String txn){
        return true;

    }
}
