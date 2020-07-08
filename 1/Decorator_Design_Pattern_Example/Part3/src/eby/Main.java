package eby;

public class Main {

    public static void main(String[] args) {
        Suit suit = new Dec();
        System.out.println(suit.getDescription() + ": $" + suit.TotalCost() + " " + suit.TotalWeight() + "kg");

        suit = new Laser(suit);
        suit = new RocketLauncher(suit);
        System.out.println(suit.getDescription() + ": $" + suit.TotalCost() + " " + suit.TotalWeight() + "kg");


    }
}
