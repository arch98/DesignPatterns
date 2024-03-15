public class NYIngridientPizza implements PizzaIngredientFactory{

    public Dough createDough(){
        return new ThinCrustDough();
    }

    public Clams createClam(){
        return new FreshClams();
    }
}
