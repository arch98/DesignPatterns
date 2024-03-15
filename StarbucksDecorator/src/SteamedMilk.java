public class SteamedMilk extends CondamentDecorator{
    public SteamedMilk(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        String desc = coffee.getDescription() + ",SteamedMilk";
        return desc;
    }

    public double getPrice(){
        double amount = coffee.getPrice() + 0.10;
        return amount;
    }
}
