public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep dish Cheese Pizza";
        dough = "Extra thick crust dough";
        sauce = "Pum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza in square peices");
    }
}
