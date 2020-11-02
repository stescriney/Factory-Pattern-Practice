/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2;

/**
 *
 * @author x18160786
 */
public class cakeFactory {//selection statement based on individual object names 
    
    
    public cake getCake(String cakeName){
        //method of type cake
        if (cakeName == null){
            return null;
        }
        
        if(cakeName.equalsIgnoreCase("PINEAPPLE")){
           return new pineapple();//will retrieve properties of the specified object
           //method can then be called in cakeTest
           
           
        }else if(cakeName.equalsIgnoreCase("BLUEBERRY")){
            return new blueberry();
        
        
        }else if(cakeName.equalsIgnoreCase("LITCHIGATEAUX")){
            return new litchiGateaux();
        
        }
        
        else if(cakeName.equalsIgnoreCase("BLACKFOREST")){
            return new blackForest();
            
        }
    
        return null;
    
    }
    
    
    
    

}
