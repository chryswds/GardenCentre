/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gardencentre;

import java.util.ArrayList;
import products.Products;

/**
 *
 * @author kheal
 */




public class ShoppingTrolley {
    
    private ArrayList<Object> items;  //this will store all the items in the trolley. They could be anything!
    
    /**
     * Create a shopping bag by initialising the items to an empty arraylist
     */
    public ShoppingTrolley(){
        
        items = new ArrayList<>(); 
    }
    
    /**
     * Add an item to the trolley
     * @param someItem the item that has been bought
     */
    public void buyItem(Object someItem){
        
        this.items.add(someItem);
    }
    
    
    /**
     * create a formatted String containing all the items in the Trolley
     * and the total value
     * @return the formatted String
     */
    public String showTrolleyContents() {
        String itemList = "";
        int totalPrice = 0;
        ArrayList<Object> countedItems = new ArrayList<>();
        
        try{
            for (Object item : items) {
                if (!countedItems.contains(item)) {
                    int quantity = countOccurrences(item);

                    //Gets the details of the item (name, amount) 
                    String gardenDetails = getGardenDetails(item, quantity);
                    
                    //Gets the price (totalprice of individual item)
                    int gardenPrice = getGardenTotalPrice(item, quantity);

                    //Updates total price with all individual total pricess
                    totalPrice += gardenPrice;
                    
                    //Formatting item list
                    itemList +=  "|\n" + "|         " + gardenDetails + "\n";
                    countedItems.add(item);
                }
            }

            itemList += "|\n" + "|                   TOTAL: €" + totalPrice;
            return itemList;
        }catch(Exception E){
            return "You should select a valid option";
        }
        
    }
    
    /**
     * Counts occurrences of a particular item in the trolley
     * @param item  the item to count
     * @return the number of times of the item
     */
    private int countOccurrences(Object item) {
        int count = 0;
        for (Object i : items) {
            if (item.equals(i)) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Gets the details of the item
     * @param item the item 
     * @param quantity amount of the item
     * @return the details of the item
     */
    private String getGardenDetails(Object item, int quantity) {
        return ((Products) item).function(quantity);
    }
    
    /**
     * Calculates the total price of the item
     * @param item The item that the price is to be calculated
     * @param quantity amount of the item
     * @return the total price
     */
    private int getGardenTotalPrice(Object item, int quantity) {
        return ((Products) item).calculateTotalPrice(quantity);
    }
   
    
    
    
    
    /**
     * create a formatted String containing all the items in the Trolley
     * @return the formatted String
     * Also clears the items list
     */
    public String emptyTrolley(){
        
        String itemList = "";
        this.items.clear(); //the trolley is empty now
        
        return itemList;
        
    }
    
}

