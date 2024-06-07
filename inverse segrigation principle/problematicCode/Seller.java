package inverse segrigation principle.problematicCode;

public class Seller {
    @Override
    public boolean canSell(){
        return false;
    }
    @Override
    public boolean canBuy(){
        return false;
    }
    //forced implemenation of behaviour
    @Override
    public boolean canAproove(){
        return false;
    }
    @Override
    public boolean canUpload(){
        return false;
    }
}
