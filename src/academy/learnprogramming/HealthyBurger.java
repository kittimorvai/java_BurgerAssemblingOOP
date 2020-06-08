package academy.learnprogramming;

class Cucumber extends Addition{
    public Cucumber() {
        super("cucumber", 200);
    }
}

class Salad extends Addition{
    public Salad() {
        super("salad", 250);
    }
}

public class HealthyBurger extends Hamburger{
    public HealthyBurger(String breadRoll, String meat, int basePrice) {
        super(breadRoll, meat, basePrice);
    }

    public void addCucumber (){
        addAddition(new Cucumber());
    }
    public void addSalad (){
        addAddition(new Salad());
    }

    @Override
    public void checkOut() {
        if (count > 6){
            System.out.println("Sorry, you cant add more additions than 6, please choose an item to delete.");
        } else {
            System.out.print("The base price of your hamburger is " + getBasePrice() + "\n" +
                    "Your hamburger contains the following additions: " + "\n" + addedToHamburger + priceOfAddition + "\n" +
                    "You have to pay " + getTotalPrice() + " in total.");
        }
    }
}
