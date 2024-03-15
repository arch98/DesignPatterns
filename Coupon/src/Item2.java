public class Item2 extends Product{
    public Item2(String name,double price,ProductType type){
        super(name,price,type);
    }

    public double getPrice(){
        return this.originalPrice;
    }
}
