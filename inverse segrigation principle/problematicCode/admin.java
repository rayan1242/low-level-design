package problematiCode;

import problematiCode.user;

public class admin implements user{
    @Override
    public boolean canSell(){
        return false;
    }
    @Override
    public boolean canBuy(){
        return false;
    }
    @Override
    public boolean canAproove(){
        return false;
    }
    @Override
    public boolean canUpload(){
        return false;
    }
}
