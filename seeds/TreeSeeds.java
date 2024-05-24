/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seeds;

/**
 *
 * @author chrystiandybas
 */
public class TreeSeeds extends Seeds{
    
    //Constructor
    public TreeSeeds(int productID) {
        super("Tree Seeds", productID, 45, 6);
    }
    
    //Abstract method function that is used in ShoppingTrolley methods
    @Override
    public String function(int quantity) {
        return "Tree Seeds x" + quantity + " - €" + (getPrice() * quantity);
    }
    
}
