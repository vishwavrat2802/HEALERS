/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VISHWAVRAT VAIBHAV
 */
public class Order {
    String UserId=null;
       int medId=0;
       int quantity=0;
       int totalPrice=0;
    
    public Order(String UserId,int medId, int q, int t) {
        this.UserId=UserId;
        this.medId=medId;
        this.quantity=q;
        this.totalPrice=t;
    }
    public String getUserId(){
        return UserId;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getTotal(){
        return totalPrice;
    }
    public int getMedId(){
        return medId;
    }
    public String toString() {
        // stringify Flight class
        return this.UserId + "," + this.medId + "," + this.quantity + ","  + this.totalPrice;
    }   
    
}
