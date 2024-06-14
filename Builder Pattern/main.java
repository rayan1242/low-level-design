package betterCode.v3;

public class main {
    public static void main(String[] args) {
        Product p=Product.getBuilder()
                         .setName("iphone")
                         .setprice(1000)
                         .setcreatedOn("12/04/2022")
                         .build();
    }
}
