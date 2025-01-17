
package factorymethod;



import java.util.Scanner;



}





public class FactoryMethod {
    public static void main(String[] args) {
        
    Scanner myObj = new Scanner(System.in);  
    System.out.println("what would you like to order? available we have we have pizza and burger");
       String ordered = myObj.nextLine();  
     
         Food food1 =FoodFactory.getFood(ordered);
         food1.order();     
    }  
}
