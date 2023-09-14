package model;


import GUI.Report;
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Food implements Serializable{
    private int FoodID;
    private String FoodName;
    private String ImageURL;
    private String Description;
    private float Price;
    private int Quantity;
    
    public Food(){
        super();
    }
    
    public Food(int FoodID, String FoodName,String ImageURL,String Description,float Price,int Quantity){
     this.FoodID =  FoodID;
     this.FoodName =  FoodName;
     this.ImageURL =  ImageURL;
     this.Description =  Description;
     this.Price =  Price;
     this.Quantity =  Quantity;
    }
    
    public int getFoodID(){
     return FoodID;
    }
    public void setFoodID(int FoodID){
      this.FoodID =  FoodID;
    }
    
    public String getFoodName(){
     return FoodName;
    }
    public void setFoodName(String FoodName){
      this.FoodName =  FoodName;
    }
    
    public String getImageURL(){
     return ImageURL;
    }
    public void setImageURL(String FoodName){
       this.ImageURL =  ImageURL;
    }
    
    public String getDescription(){
     return Description;
    }
    public void setDescription(String Description){
       this.Description =  Description;
    }
    
    public float getPrice(){
     return Price;
    }
    public void setPrice(float Price){
       this.Price = Price;
    }
    
    public int getQuantity(){
     return Quantity;
    }
    public void setQuantity(int Quantity){
       this.Quantity =  Quantity;
    }
}
