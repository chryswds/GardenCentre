/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seeds;
import products.Products;
/**
 *
 * @author chrystiandybas
 */
public abstract class Seeds extends Products{
    
    
    //Properties that are only related to seeds
    
    private int daysToSprout;
    
    
    //Constructors

    public Seeds(String item, int productID, int daysToSprout, int price) {
        super(item,productID, price);
        this.daysToSprout = daysToSprout;
    }
    
    /**
     * Simple method to describe what the seed does
     * @return a String describing the action
     */
    
    public abstract String function(int quantity); //Any child of Seeds must have an action method
    
    

    
    //Getter and Setter with the seeds caracteristics
    public int getDaysToSprout() {
        return daysToSprout;
    }

    public void setDaysToSprout(int daysToSprout) {
        this.daysToSprout = daysToSprout;
    }

    
}
