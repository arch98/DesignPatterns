import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Product item1 = new Items1("Fan",1000,ProductType.Electronics);
        Product item2 = new Item2("Fridge",3000,ProductType.Electronics);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);

        double price = cart.getPriceAfterDiscount();
       System.out.println(price);

    }
}