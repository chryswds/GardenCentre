/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seeds;

/**
 *
 * @author chrystiandybas
 */
public class StrawberrySeeds extends Seeds{

    
    //Contructor
    public StrawberrySeeds( int productID ) {
        super("Strawberry Seeds", productID,30, 2);
    }
    
    
    
    //Abstract method function that is used in ShoppingTrolley methods
    @Override
    public String function(int quantity) {
        return "Strawberry Seeds x" + quantity + " - €" + (getPrice() * quantity);
    }
    
}
