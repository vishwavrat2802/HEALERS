/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VISHWAVRAT VAIBHAV
 */
public class MainManager {
    OrderManager ODM;
    AppointmentManager APM;
    UserManager UM;
    private String userId=null;
    
    public MainManager(){
        ODM = new OrderManager();
        APM = new AppointmentManager();
        UM = new UserManager();
    }
    public void setUserId(String UserId){
        this.userId=UserId;
    }
    public void resetUserId(String UserId){
        this.userId=null;
    }
    public static void main(String[] args){
        DisplayManager dpMngr = new DisplayManager(new MainManager());
    }
}
