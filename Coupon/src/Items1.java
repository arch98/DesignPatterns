public class Items1 extends  Product{

    public Items1(String name,double price,ProductType type){
        super(name,price,type);
    }

    public double getPrice(){
        return this.originalPrice;
    }
}
