import java.util.ArrayList;
import java.util.List;

public class TypeDiscount extends CouponDecorator{
    Product product;
    double discount;

    ProductType type;
   static List<ProductType> eligiblelist = new ArrayList<>();
    static {
        eligiblelist.add(ProductType.Furniture);
        eligiblelist.add(ProductType.Electronics);
    }

    public TypeDiscount(Product product,double discount,ProductType type){
        this.product = product;
        this.discount = discount;
        this.type = type;

    }

    public double getPrice(){


        double originalPrice = product.getPrice();

       if(eligiblelist.contains(type)) {
           originalPrice = originalPrice * (1 - (discount / 100.0));
       }
        return originalPrice;
    }
}
