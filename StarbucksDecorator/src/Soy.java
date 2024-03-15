public class Soy extends CondamentDecorator{

    public Soy(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        String desc = coffee.getDescription() + ",Soy";
        return desc;
    }

    public double getPrice(){
        double amount = coffee.getPrice() + 0.15;
        return amount;
    }
}
