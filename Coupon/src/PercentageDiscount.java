public class PercentageDiscount extends CouponDecorator{

    Product product;
    double discount;

    public PercentageDiscount(Product product,double discount){
        this.product = product;
        this.discount = discount;
    }

    public double getPrice(){
        double originalPrice = product.getPrice();

        originalPrice = originalPrice*(1 -(discount/100.0));
        return originalPrice;
    }
}
