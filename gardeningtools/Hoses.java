/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gardeningtools;

/**
 *
 * @author chrystiandybas
 */
public class Hoses extends GardeningTools{
    
    //Constructor
    public Hoses( int productID) {
        super("Hoses", productID, 40);
    }

    //Abstract method function that is used in ShoppingTrolley methods
    @Override
    public String function(int quantity) {
        return "Hoses x" + quantity + " - €" + (getPrice() * quantity);
    }
    
}
