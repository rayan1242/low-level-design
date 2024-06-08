package betterCode.v3;

public public class Product{
    private String id;
    private String name;
    private int price;
    private String quality;
    private String createdOn;
    private String DeliveryOn;
    private String batchNO;

    Product(Builder b){
        if(b.getprice()>0)
            this.price=b.getprice();
        this.name=b.getName();
        //...........
    } 

}
