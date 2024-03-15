public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.ingredientFactory = pizzaIngredientFactory;
    }

    void prepare(){
        System.out.println("Preparing"+name);
    }
}
