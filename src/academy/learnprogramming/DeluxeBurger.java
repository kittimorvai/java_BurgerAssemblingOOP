package academy.learnprogramming;

class Chips extends Addition{
    public Chips() {
        super("chips", 500);
    }
}

class Drinks extends Addition{
    public Drinks() {
        super("drink", 500);
    }
}

public class DeluxeBurger extends Hamburger{
    private boolean hasBeenChips = false;
    private boolean hasBeenDrinks = false;
    private int count = 0;


    public DeluxeBurger(String breadRoll, String meat, int basePrice) {
        super(breadRoll, meat, basePrice);

        addChips();
        count ++;
        hasBeenChips = true;

        addDrinks();
        count ++;
        hasBeenDrinks = true;
    }

    public void addChips (){
        addAddition(new Chips());
    }
    public void addDrinks (){
        addAddition(new Drinks());
    }

    @Override
    public void checkOut() {
            System.out.print("The base price of your hamburger is " + getBasePrice() + "\n" +
                    "Your hamburger contains the following additions: " + "\n" + addedToHamburger + priceOfAddition + "\n" +
                    "You have to pay " + getTotalPrice() + " in total.");


    }

    @Override
    public void addAddition(Addition addition) {
        if (count >2){
            System.out.println("\n" + "Sorry, you cant add any more additions.");
        } else {
            count++;
            totalPrice += addition.getPrice();
            hasBeenAdded = true;
            addedToHamburger += addition.getName() + "\n";
            priceOfAddition += addition.getPrice() + "\n";

        }
    }
}
