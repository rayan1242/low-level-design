package State_Design_Pattern.v2;
import State_Design_Pattern.v2.ATMStates;
import java.util.UUID;


public class ATM {
    private final String deviceId;
    public ATMStates state;


    ATM(String deviceId){
        this.deviceId=deviceId;
        this.state=new ReadyState(this);
    }

    public String init(){
        return this.state.init();
    }
    
    public void changeState(ATMStates state){
    this.state=state;
    }

    public boolean cancel(String txn){
        return this.state.cancelTxn(txn);
    }
}
