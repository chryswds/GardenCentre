/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gardencentre;

import java.util.Scanner;
import gardencentre.ShoppingTrolley;
import seeds.*;
import gardeningtools.*;

/**
 *
 *  2023334
 */
public class GardenCentre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ShoppingTrolley myTrolley = new ShoppingTrolley(); //now I have a shopping trolley to put things in!
        Scanner myKB = new Scanner(System.in);//Creating scanner to take user input
        
        int choice = 0;// initialising choice variable
        
        
        //Loop to display the menu until user chooses to checkout
        while(choice != 8){
            try{
                System.out.println(" ______________________________________________ \n"
                                  +"|----------------------------------------------|\n"
                                  +"|________ WELCOME TO THE GARDEN CENTRE ________|\n"
                                  +"|----------------------------------------------|\n"
                                  +"|___ CHOOSE THE ITEMS YOU WANT TO BUY _________|\n"
                                  +"|----------------------------------------------|\n"
                                  +"|--- SEEDS ------------------------------------|\n"
                                  +"|___ 1) Strawberry Seeds - €2.00 ______________|\n"
                                  +"|___ 2) Sunflower Seeds -- €1.00 ______________|\n"
                                  +"|___ 3) Tree Seeds ------- €6.00 ______________|\n"
                                  +"|----------------------------------------------|\n"
                                  +"|--- GARDENING TOOLS --------------------------|\n"
                                  +"|___ 4) Gloves ----------- €20.00 _____________|\n"
                                  +"|___ 5) Hoses ------------ €40.00 _____________|\n"
                                  +"|___ 6) Trowels ---------- €15.00 _____________|\n"
                                  +"|----------------------------------------------|\n"
                                  +"|___ 7) Empty Trolley _________________________|\n"
                                  +"|___ 8) Proceed to Checkout ___________________|\n"
                                  +"|______________________________________________|\n");
                choice = myKB.nextInt();
                
                int amount = 0;
                
                
                //Switch statement to deal with different choices
                switch (choice){
                    case 1:
                        System.out.println(" ---------------------------------------------- \n"
                                          +"|HOW MANY STRAWBERRY SEEDS DO YOU WANT TO BUY? |\n"
                                          +" ---------------------------------------------- \n");
                        amount = myKB.nextInt();
                        
                        //Add the specified amount of the item to the trolley
                        if (amount > 0 ){
                            StrawberrySeeds strSeeds = new StrawberrySeeds(1);
                            for (int i = 0; i < amount; i++) {
                                myTrolley.buyItem(strSeeds);
                            }
                        }
                        else{
                            //If the amount is invalid (negative) display an error message
                            System.out.println(" ---------------------------------------------- \n"
                                              +"|Invalid amount, please enter a positive number|\n"
                                              +" ---------------------------------------------- \n");
                        }
                        //Print showing how many of the item was added to the trolley
                        System.out.println(" ---------------------------------------------- \n"
                                          +"|You added " +amount+ " strawberry seeds to your trolley |\n"
                                          +" ---------------------------------------------- \n");
                        break;
                    case 2:
                        System.out.println(" ---------------------------------------------- \n"
                                          +"|HOW MANY SUNFLOWER SEEDS DO YOU WANT TO BUY? |\n"
                                          +" ---------------------------------------------- \n");
                        amount = myKB.nextInt();
                        
                        //Add the specified amount of the item to the trolley
                        if (amount > 0 ){
                            SunflowerSeeds sunSeeds = new SunflowerSeeds( 2);
                            for (int i = 0; i < amount; i++) {
                                myTrolley.buyItem(sunSeeds);
                            }
                        }
                        else{
                            //If the amount is invalid (negative) display an error message
                            System.out.println(" ---------------------------------------------- \n"
                                              +"|Invalid amount, please enter a positive number|\n"
                                              +" ---------------------------------------------- \n");
                        }
                        //Print showing how many of the item was added to the trolley
                        System.out.println(" ---------------------------------------------- \n"
                                          +"|You added " +amount+ " sunflower seeeds to your trolley |\n"
                                          +" ---------------------------------------------- \n");
                        break;
                    case 3:
                        System.out.println(" ---------------------------------------------- \n"
                                          +"     HOW MANY TREE SEEDS DO YOU WANT TO BUY?   |\n"
                                          +" ---------------------------------------------- \n");
                        amount = myKB.nextInt();
                        
                        //Add the specified amount of the item to the trolley
                        if (amount > 0 ){
                            TreeSeeds treeSeeds = new TreeSeeds( 3);
                            for (int i = 0; i < amount; i++) {
                                myTrolley.buyItem(treeSeeds);
                            }
                        }
                        else{
                            //If the amount is invalid (negative) display an error message
                            System.out.println(" ---------------------------------------------- \n"
                                              +"|Invalid amount, please enter a positive number|\n"
                                              +" ---------------------------------------------- \n");
                        }
                        //Print showing how many of the item was added to the trolley
                        System.out.println(" ---------------------------------------------- \n"
                                          +"|You added " +amount+ " tree seeds to your trolley        |\n"
                                          +" ---------------------------------------------- \n");
                        break;
                    case 4:
                        System.out.println(" ---------------------------------------------- \n"
                                          +"|HOW MANY GLOVES DO YOU WANT TO BUY?           |\n"
                                          +" ---------------------------------------------- \n");
                        amount = myKB.nextInt();
                        
                        //Add the specified amount of the item to the trolley
                        if (amount > 0 ){
                            Gloves gloves = new Gloves( 4);
                            for (int i = 0; i < amount; i++) {
                                myTrolley.buyItem(gloves);
                            }
                        }
                        else{
                            //If the amount is invalid (negative) display an error message
                            System.out.println(" ---------------------------------------------- \n"
                                              +"|Invalid amount, please enter a positive number|\n"
                                              +" ---------------------------------------------- \n");
                        }
                        //Print showing how many of the item was added to the trolley
                        System.out.println(" ---------------------------------------------- \n"
                                          +"|You added " +amount+ " gloves to your trolley            |\n"
                                          +" ---------------------------------------------- \n");
                        break;
                    case 5:
                        System.out.println(" ---------------------------------------------- \n"
                                          +"|HOW MANY HOSES DO YOU WANT TO BUY?            |\n"
                                          +" ---------------------------------------------- \n");
                        amount = myKB.nextInt();
                        
                        //Add the specified amount of the item to the trolley
                        if (amount > 0 ){
                            Hoses hoses = new Hoses( 5);
                            for (int i = 0; i < amount; i++) {
                                myTrolley.buyItem(hoses);
                            }
                        }
                        //If the amount is invalid (negative) display an error message
                        else{
                            System.out.println(" ---------------------------------------------- \n"
                                              +"|Invalid amount, please enter a positive number|\n"
                                              +" ---------------------------------------------- \n");
                        }
                        //Print showing how many of the item was added to the trolley
                        System.out.println(" ---------------------------------------------- \n"
                                          +"|You added " +amount+ " hoses to your trolley            |\n"
                                          +" ---------------------------------------------- \n");
                        break;
                    case 6:
                        System.out.println(" ---------------------------------------------- \n"
                                          +"|HOW MANY TROWELS DO YOU WANT TO BUY?          |\n"
                                          +" ---------------------------------------------- \n");
                        amount = myKB.nextInt();
                        
                        //Add the specified amount of the item to the trolley
                        if (amount > 0 ){
                            Trowels trowels = new Trowels( 6);
                            for (int i = 0; i < amount; i++) {
                                myTrolley.buyItem(trowels);
                            }
                        }
                        else{
                            //If the amount is invalid (negative) display an error message
                            System.out.println(" ---------------------------------------------- \n"
                                              +"|Invalid amount, please enter a positive number|\n"
                                              +" ---------------------------------------------- \n");
                        }
                        //Print showing how many of the item was added to the trolley
                        System.out.println(" ---------------------------------------------- \n"
                                          +"|You added " +amount+ " trowels to your trolley           |\n"
                                          +" ---------------------------------------------- \n");
                        break;
                    case 7:
                        //Empty the trolley
                        System.out.println(" ---------------------------------------------- \n"
                                          +"|-------- YOUR TROLLEY IS NOW EMPTY -----------|\n"
                                          + myTrolley.emptyTrolley() +
                                          " ---------------------------------------------- \n");
                        break;
                        
                
                    case 8:
                        //Display the items selected and the price using showTrolleyContents() method
                        System.out.println(" ---------------------------------------------- \n"
                                          +"|---------------------------------------------|\n"
                                          +"|            Items in your trolley:           |\n"
                                          + myTrolley.showTrolleyContents() + "\n" +
                                          " ---------------------------------------------- \n");
                        break;
                    default:
                        //Display error message if user selects a number that is not an option
                        System.out.println(" ---------------------------------------------- \n"
                                 +"|       You should select a valid option       |\n"
                                 + " ----------------------------------------------");
                        }  
            }catch(Exception E){
                //Catch error message if user types letters or signs
                System.out.println(" ---------------------------------------------- \n"
                                 +"|       You should select a valid option       |\n"
                                 + " ----------------------------------------------");
                myKB.nextLine();
                
            }
            
            
        }
        
    }
    
}

