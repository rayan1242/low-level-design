package State_Design_Pattern.v1;

import v1.ATMSTATES;
import java.util.UUID;

private final String deviceId;


public ATMSTATES state;

public class ATM {
    
    ATM(String deviceId){
        this.deviceId=deviceId;
        this.state=ATMSTATES.READY;
    }

    public String init(){
        String txn=UUID.randomUUID.toString();
        this.state=ATMSTATES.CASH_READING;
        return txn;
    }
}
