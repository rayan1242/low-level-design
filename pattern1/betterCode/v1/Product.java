package betterCode.v1;

public class Product{
    private String id;
    private String name;
    private int price;
    private String quality;
    private String createdOn;
    private String DeliveryOn;
    private String batchNO;

    Product(){
    
    }
    //now we can have optional attributes,no need to give default values for all.
    //But the problem is u will be initializing the object before validation 
    public void setName(String name){
        this.name=name;
    }

    public void setquality(String quality){
        if(price>0)
            this.quality=quality;
    }

    public void setprice(int price){
        this.price=price;
    }

    public void setcreatedOn(String createdOn){
        this.createdOn=createdOn;
    }

    
}