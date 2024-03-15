public class Mocha extends CondamentDecorator{


    public Mocha(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        String desc = coffee.getDescription() + ",Mocha";
        return desc;
    }

    public double getPrice(){
        double amount = coffee.getPrice() + 0.20;
        return amount;
    }
}
