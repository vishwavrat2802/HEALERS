/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VISHWAVRAT VAIBHAV
 */
public class DisplayManager {
    private OrderManagerUI ODM;
    private OnlineAppointmentUI OA;
    private HomeUI HUI;
    private SignUp SU;
    MainManager mnMngr;
    
    public DisplayManager(MainManager mnMngr){
        this.mnMngr=mnMngr;
    }
    public void hideAll(){
        ODM.setVisible(false);
        OA.setVisible(false);
        HUI.setVisible(false);
        SU.setVisible(false);
    }
    public void showHomeUI(){
        hideAll();
        HUI.setVisible(true);
    }
    public void showSignUp(){
        hideAll();
        SU.setVisible(true);
    }
    public void showOrderManagerUI(){
        hideAll();
        ODM.setVisible(true);
    }
    public void showOnlineAppointmentUI(){
        hideAll();
        OA.setVisible(true);
    }
    public static void main(String[] args){
        
        DisplayManager dpMngr = new DisplayManager(new MainManager());
        dpMngr.HUI = new HomeUI(dpMngr);
        dpMngr.SU = new SignUp(dpMngr);
        dpMngr.ODM = new OrderManagerUI(dpMngr);
        dpMngr.OA = new OnlineAppointmentUI(dpMngr);
        dpMngr.showHomeUI();
    }
}
