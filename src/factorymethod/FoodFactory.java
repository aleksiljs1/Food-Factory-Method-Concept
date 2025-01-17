/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author User
 */
public class FoodFactory {
    

public static Food getFood(String type){
    if (type.equalsIgnoreCase("pizza")){
    return new Pizza();
    }
    else if (type.equalsIgnoreCase("burger")){
            
     return new Burger();
            }
    
    
            
            
    
    return null;

}
}
