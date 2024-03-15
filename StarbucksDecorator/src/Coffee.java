public abstract class Coffee {

    String description;
    double price;

    public Coffee(){
        description = "beverage";
        price = 0.0;
    }



    public abstract String getDescription();
    public abstract double getPrice();
}
