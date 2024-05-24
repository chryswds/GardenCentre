/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package products;

/**
 *
 * @author chrystiandybas
 */
public abstract class Products {
    
    //Aspects that are commom within all items
    private String item; 
    private int productID; 
    private int price;

    
    
    //Constructor to initialise products
    public Products(String item, int productID, int price) {
        this.item = item;
        this.productID = productID;
        this.price = price;
    }
    
    //Abstract method to be implemented by subclasses 
    public abstract String function(int quantity);
    
    
    //Getters and Setters for each variable
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public int calculateTotalPrice(int quantity) {
        return getPrice() * quantity;
    }
    
    public String getName() {
        return item;
    }
    
    
}

