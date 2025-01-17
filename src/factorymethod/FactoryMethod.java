
package factorymethod;



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

    
 
    
   
    public static void main(String[] args) {
        
    Scanner myObj = new Scanner(System.in);  
    System.out.println("what would you like to order? available we have we have pizza and burger");
       String ordered = myObj.nextLine();  
     
         Food food1 =FoodFactory.getFood(ordered);
         food1.order();
      
      
    }  
}
