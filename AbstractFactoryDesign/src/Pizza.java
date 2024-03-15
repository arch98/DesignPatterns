import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Clams clams;

    abstract void prepare();
    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void bake(){
        System.out.println("Bake for 25 minutes");
    }

    void cut(){
        System.out.println("Cutting the pizza");
    }

    void box(){
        System.out.println("Box");
    }


}
