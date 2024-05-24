/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seeds;

/**
 *
 * @author chrystiandybas
 */
public class SunflowerSeeds extends Seeds{

    //Constructor
    public SunflowerSeeds(int productID) {
        super("Sunflower Seeds", productID, 7, 1);
    }
    
    //Abstract method function that is used in ShoppingTrolley methods
    @Override
    public String function(int quantity) {
        return "Sunflower Seeds x" + quantity + " - €" + (getPrice() * quantity);
    }
    
    
}
