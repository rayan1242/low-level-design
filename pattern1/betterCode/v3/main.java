package betterCode.v3;

public class main {
    public static void main(String[] args) {
        Builder b=new Builder();
        b.setName("iphone");
        b.setprice(1000);
        Product p=new Product(b);
    }
}
