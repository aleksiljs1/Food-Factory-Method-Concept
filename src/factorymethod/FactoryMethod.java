/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorymethod;

/**
 *
 * @author User
 */

import java.util.Scanner;


abstract class Food {
    
public abstract void order ();


}

class pizza extends Food {
 public void  order(){
    
    System.out.println("here is your pizza");
    
}
}

class burger extends Food {

public void order() {
    System.out.println("here is your burger");
} 

}

class FoodFactory{

public static Food getFood(String type){
    if (type.equalsIgnoreCase("pizza")){
    return new pizza();
    }
    else if (type.equalsIgnoreCase("burger")){
            
     return new burger();
            }
    
    
            
            
    
    return null;

}}

public class FactoryMethod {

    
 
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("what would you like to order? available we have we have pizza and burger");
       String ordered = myObj.nextLine();  // Read user input
     
         Food food1 =FoodFactory.getFood(ordered);
         food1.order();
      
      
    }  
}
