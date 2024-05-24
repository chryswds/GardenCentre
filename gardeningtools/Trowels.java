/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gardeningtools;

/**
 *
 * @author chrystiandybas
 */
public class Trowels extends GardeningTools{
    
    //Constructor
    public Trowels( int productID) {
        super("Trowels", productID, 15);
    }

    
    //Abstract method function that is used in ShoppingTrolley methods
    @Override
    public String function(int quantity) {
        return "Trowels x" + quantity + " - €" + (getPrice() * quantity);
    }
    
}
