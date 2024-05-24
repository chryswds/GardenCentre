/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gardeningtools;
import products.Products;
/**
 *
 * @author chrystiandybas
 */
public abstract class GardeningTools extends Products{
    
    //Constructor
    public GardeningTools(String item, int productID, int price) {
        super (item,productID,price);
    }
    
    //Abstract method function that is used in ShoppingTrolley methods
    @Override
    public abstract String function(int quantity);

    

    
}
