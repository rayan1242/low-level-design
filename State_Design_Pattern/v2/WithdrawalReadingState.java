package State_Design_Pattern.v2;

public class WithdrawalReadingState implements ATMStates{
    @Override
    String init (){
        return null;
    }

    @Override
    boolean cancelTxn(String txn){
        return true;
    }

    @Override
    void ejectCard(){
        return true;

    }

    @Override
    boolean readCard(String txn,String cardType,String cardNum,String cardCVV){
        return true;

    }

    @Override
    boolean readWithdrawDetails(float amount,String txn,int pin){
        return true;

    }

    @Override
    boolean dispenseCash(String txn){
        return true;

    }
}
