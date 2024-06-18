package State_Design_Pattern.v2;

public class CardReadingState implements ATMStates{

    private final ATM atm;

    public CardReadingState(ATM atm){
        this.atm=atm;
    }

    @Override
    public String init (){
        return null;
    }

    @Override
    public boolean cancelTxn(String txn){
       // logic to cancel the transaction
        this.atm.changeState(new ReadyState(this.atm));
        return true;
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
