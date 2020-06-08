package academy.learnprogramming;
import org.w3c.dom.ls.LSOutput;

// Hamburger can have maximum 4 additions
// HealthyBurger can have maximum 6 additions
// DeluxeBurger can only have chips and drinks as addition

class Addition{
    private String name;
    private int price;

    public Addition(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}

class Lettuce extends Addition{

    public Lettuce() {
        super("lettuce", 300);
    }
}

class Tomato extends Addition {

    public Tomato() {
        super("tomato", 200);
    }
}

class Cheese extends Addition{

    public Cheese() {
        super("cheese", 350);

    }
}

class Ketchup extends Addition {

    public Ketchup() {
        super("ketchup", 50);
    }


}


public class Main {

    public static void main(String[] args) {

	    Hamburger hamburger = new Hamburger("basic","beef", 1000);
        hamburger.addLettuce();
        hamburger.addCheese();
        hamburger.checkOut();

        HealthyBurger healthy = new HealthyBurger("basic", "chicken", 1000);
        healthy.addCheese();
        healthy.addCucumber();
        healthy.addCheese();
        healthy.addCheese();
        healthy.addCucumber();
        healthy.addCheese();
        healthy.addCucumber();
        healthy.checkOut();

        DeluxeBurger deluxe = new DeluxeBurger("basic", "pork", 1000);
        deluxe.checkOut();
        deluxe.addCheese();



    }
}
