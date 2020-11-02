/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2;
import java.util.Scanner;

/**
 *
 * @author x18160786
 */
public class cakeTest {
    
    public static void main (String args[]){
    
        
     String ans = null;
        
     do{//do while loop, allow user to retrieve object properties until specified otherwise 
    
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        
    
        System.out.println("Enter Choice");
        System.out.println("1: Pineapple");
        System.out.println("2: Blueberry");
        System.out.println("3: Black Forest");
        System.out.println("4: Litchi Gateaux");
    
    
        choice = sc.nextInt();
        
        if(choice<1||choice>4){
        System.out.println("Invalid");
    
        }else if (choice == 1){  
        
            cakeFactory myCakeFactory = new cakeFactory();
    
            cake myCake =  myCakeFactory.getCake("PINEAPPLE");//retrieve specified object using getCake method
    
            myCake.display();//display properties to user as featured in the relevant sub class
    
    
    
        }else if (choice == 2){  
        
        cakeFactory myCakeFactory = new cakeFactory();
    
        cake myCake =  myCakeFactory.getCake("BLUEBERRY");
    
        myCake.display();
    
    
    
    
        }else if (choice == 3){  
        
        cakeFactory myCakeFactory = new cakeFactory();
    
        cake myCake =  myCakeFactory.getCake("BLACKFOREST");
    
        myCake.display();
    
    
    
    
        }else if (choice == 4){  
        
        cakeFactory myCakeFactory = new cakeFactory();
    
        cake myCake =  myCakeFactory.getCake("LITCHIGATEAUX");
    
        myCake.display();
    
        }
    
        System.out.println("Would you like to choose agin?  Y/N");
        ans = sc.next();//allow user to continue
     }//close do
     
     while(ans.equalsIgnoreCase("Y"));
    
    }//close main
    
    
    
}
