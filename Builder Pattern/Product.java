package betterCode.v3;

public class Product{
    private String id;
    private String name;
    private int price;
    private String quality;
    private String createdOn;
    private String DeliveryOn;
    private String batchNO;

    private Product(Builder b){
        if(b.getprice()>0)
            this.price=b.getprice();
        this.name=b.getName();
        //...........
    } 

    public static Builder getBuilder(){
        return new Builder();
    }

    public class Builder {
        private String id;
        private String name;
        private int price;
        private String quality;
        private String createdOn;
        private String DeliveryOn;
        private String batchNO;

        public Product build(){
            return new Product();
        }

        public Builder setName(String name){
            this.name=name;
            return this;
        }
    
        public Builder setquality(String quality){
                this.quality=quality;
                return this;

        }
    
        public Builder setprice(int price){
            if(price>0)
            this.price=price;
            return this;

        }
    
        public Builder setcreatedOn(String createdOn){
            this.createdOn=createdOn;
            return this;

        }

        public String getName(){
            return name;
        }
    
        public String getquality(){
            return quality;
        }
        
        public int getprice(){
            return price;
        }
    
        public String setcreatedOn(){
            return setcreatedOn();
        }

        
    
    }
    

}
