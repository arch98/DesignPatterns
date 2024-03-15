public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String item){
        PizzaIngredientFactory ingredientFactory = new NYP

        if(item.equals("cheese")){
            return new CheesePizza("cheese");
        }else if(item.equals("veggie")){
            return new NYStyleVeggiePizza();
        }

        return null;
    }
}
