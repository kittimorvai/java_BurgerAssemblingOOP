package academy.learnprogramming;

import java.util.Scanner;

public class Hamburger {
    private final int basePrice;
    int totalPrice;

    int count = 0;
    boolean hasBeenAdded = false;
    String addedToHamburger = "";
    String priceOfAddition = "";

    public Hamburger(String breadRoll, String meat, int basePrice) {
        this.basePrice = basePrice;
        this.totalPrice = basePrice;
    }
    public int getBasePrice(){
        return basePrice;
    }

    public void addAddition (Addition addition){
            count++;
            totalPrice += addition.getPrice();
            hasBeenAdded = true;
            addedToHamburger += addition.getName() + "\n";
            priceOfAddition += addition.getPrice() + "\n";
    }

    public void addLettuce (){
        addAddition(new Lettuce());
    }
    public void addTomato (){
        addAddition(new Tomato());
    }
    public void addCheese (){
        addAddition(new Cheese());
    }
    public void addKetchup (){
        addAddition(new Ketchup());
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    public void checkOut(){
        if (count > 4){
            System.out.println("\nSorry, you cant add more than 4 additions, please delete an item.\n");
        } else {
            System.out.print("The base price of your hamburger is " + getBasePrice() + "\n" +
                    "Your hamburger contains the following additions: " + "\n" + addedToHamburger + priceOfAddition + "\n" +
                    "You have to pay " + getTotalPrice() + " in total.");
        }

    }
}
