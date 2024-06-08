package betterCode.v2;

import java.util.HashMap;

public class Product{
    private String id;
    private String name;
    private int price;
    private String quality;
    private String createdOn;
    private String DeliveryOn;
    private String batchNO;

    Product(HashMap<String,Object> hm){
        if(hm.get("price").equals(0))
            this.price=hm.get("price").;
    }

}