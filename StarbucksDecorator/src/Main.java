public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Coffee coffee = new Expresso();
        System.out.println(coffee.getDescription()+","+coffee.getPrice());

        Coffee coffee1 =  new DarkRoast();
        coffee1 = new Mocha(coffee1);
        coffee1 = new Mocha(coffee1);
        coffee1 = new WhippedCream(coffee1);
      System.out.println(coffee1.getDescription()+","+coffee1.getPrice());

      Coffee coffee3 = new HouseBlend();
      coffee3 = new Soy(coffee3);
      coffee3 = new Mocha(coffee3);
      coffee3 = new WhippedCream(coffee3);
      System.out.println(coffee3.getDescription()+","+coffee3.getPrice());

    }
}