package State_Design_Pattern.v2;

public class StateFactory {
    
    public static ATMStates getState(ATMStateEnum state,ATM atm){
        if(state.equals(ATMStateEnum.READY)){
            return new ReadyState(atm);
        }
        if(state.equals(ATMStateEnum.CARD_READING)){
            return new CardReadingState(atm);
        }
        if(state.equals(ATMStateEnum.CASH_WITHDRAWAL)){
            return new WithdrawalReadingState(atm);
        }
    }
}
