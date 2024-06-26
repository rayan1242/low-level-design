//OCP AND ISP is violated
package State_Design_Pattern.v1;

import State_Design_Pattern.v1.ATMSTATES;
import java.util.UUID;

public class ATM {
    
    
private final String deviceId;


public ATMSTATES state;


    ATM(String deviceId){
        this.deviceId=deviceId;
        this.state=ATMSTATES.READY;
    }

    public String init(){
        if(this.state.equals(ATMSTATES.CARD_READING)){
            throw new IllegalArgumentException("Txn in process");
        }
        if(this.state.equals(ATMSTATES.CARD_EJECTING)){
            throw new IllegalArgumentException("Txn in process");
        }
        if(this.state.equals(ATMSTATES.CASH_WITHDRAWAL)){
            throw new IllegalArgumentException("Txn in process");
        }
        String txn=UUID.randomUUID().toString();
        this.state=ATMSTATES.CARD_READING;
        return txn;
    }
    
    public void cancelTxn(){
        if(this.state.equals(ATMSTATES.CARD_READING)){
        }
        if(this.state.equals(ATMSTATES.CARD_EJECTING)){
        }
        if(this.state.equals(ATMSTATES.CASH_WITHDRAWAL)){
        }
    }

    public void readCard(){
        if(this.state.equals(ATMSTATES.CARD_READING)){
        }
        if(this.state.equals(ATMSTATES.CARD_EJECTING)){
        }
        if(this.state.equals(ATMSTATES.CASH_WITHDRAWAL)){
        }
    }

    public void withdrawCash(){
        if(this.state.equals(ATMSTATES.CARD_READING)){
        }
        if(this.state.equals(ATMSTATES.CARD_EJECTING)){
        }
        if(this.state.equals(ATMSTATES.CASH_WITHDRAWAL)){
        }
    }
}
