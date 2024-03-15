public class WhippedCream extends CondamentDecorator{
    public WhippedCream(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        String desc = coffee.getDescription() + ",WhippedCream";
        return desc;
    }

    public double getPrice(){
        double amount = coffee.getPrice() + 0.10;
        return amount;
    }
}
