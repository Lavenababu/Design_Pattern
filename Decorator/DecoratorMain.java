package Decorator;

import Decorator.Controller.IceCream;
import Decorator.Model.BasicIceCream;
import Decorator.Model.MintIceCream;
import Decorator.Model.VanillaIceCream;

public class DecoratorMain {

    public static void main(String[] args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-cream cost $" + basicIceCream.cost());

        //Add Vanilla to the order

        IceCream vanilla = new VanillaIceCream(basicIceCream); // wrapping vanilla
        System.out.println("Adding Vanilla - cost is: $" + vanilla.cost());


        //Add Mint to the order
        IceCream mint = new MintIceCream(vanilla);
        System.out.println("Adding Mint - cost is: $" + mint.cost());


    }
}
