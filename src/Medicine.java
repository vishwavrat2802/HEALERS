/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VISHWAVRAT VAIBHAV
 */
public class Medicine {
    private String productName=null;
    private int medId=0;
    private int price=0;
    
    public Medicine(int medId,String name,int pr) {
        this.medId=medId;
        this.productName=name;
        this.price=pr;
    }
    
    public String getName(){
        return productName;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getMedId(){
        return medId;
    }
    
    public String toString() {
        // stringify Flight class
        return this.medId + "," + this.productName + "," + this.price;
    }   
}