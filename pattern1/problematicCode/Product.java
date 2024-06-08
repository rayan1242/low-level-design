package problematicCode;

public class Product{
    private String id;
    private String name;
    private int price;
    private String quality;
    private String createdOn;
    private String DeliveryOn;
    private String batchNO;

    Product(String id,String name,int price,String quality,String createdOn,String DeliveryOn,String batchNO){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quality=quality;
        this.createdOn=createdOn;
        this.DeliveryOn=DeliveryOn;
        this.batchNO=batchNO;
    }

    Product(String id,String name,int price){

    }
    //problem with constructor overloading, same signature
    Product(String quality,String createdOn){

    }

    Product(String id,String name){

    }

}