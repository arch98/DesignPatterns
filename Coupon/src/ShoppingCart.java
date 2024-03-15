import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList;


    public ShoppingCart(){
        productList = new ArrayList<>();
    }
    public void addToCart(Product product){
        Product productWithDiscount = new TypeDiscount(new PercentageDiscount(product,10),10,ProductType.Electronics);
        productList.add(productWithDiscount);
    }

    public double getPriceAfterDiscount(){

        double total = 0;
        for(Product product : productList){
            total += product.getPrice();
        }

        return total;
    }
}
