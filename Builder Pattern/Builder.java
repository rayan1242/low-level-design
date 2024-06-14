package betterCode.v3;

public class Builder {
        private String id;
        private String name;
        private int price;
        private String quality;
        private String createdOn;
        private String DeliveryOn;
        private String batchNO;

        Builder(){
        
        }

        public void setName(String name){
            this.name=name;
        }
    
        public void setquality(String quality){
                this.quality=quality;
        }
    
        public void setprice(int price){
            if(price>0)
            this.price=price;
        }
    
        public void setcreatedOn(String createdOn){
            this.createdOn=createdOn;
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
