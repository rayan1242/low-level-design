package State_Design_Pattern.v2;

public class WithdrawalReadingState implements ATMStates{

    private final ATM atm;

    public WithdrawalReadingState(ATM atm){
        this.atm=atm;
    }


    @Override
    public String init (){
        return null;
    }

    @Override
    public boolean cancelTxn(String txn){
        return true;
    }

    @Override
    public void ejectCard(){
        return true;

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
