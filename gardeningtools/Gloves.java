/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gardeningtools;

/**
 *
 * @author chrystiandybas
 */
public class Gloves extends GardeningTools{

    //constructor 
    public Gloves(int productID) {
        super("Gloves", productID, 20);
    }

    //Abstract method function that is used in ShoppingTrolley methods
    @Override
    public String function(int quantity) {
        return "Gloves x" + quantity + " - €" + (getPrice() * quantity);
    }
    
    
}
