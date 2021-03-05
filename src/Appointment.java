/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VISHWAVRAT VAIBHAV
 */
public class Appointment {
    private String userId= null;
    private String patientName=null;
    private String department=null;
    private String dateTime=null;
    private int queue=0;
    
    public Appointment(int queue, String userId, String name, String dpmt, String dateTime){
        this.userId=userId;
        this.patientName=name;
        this.department=dpmt;
        this.dateTime=dateTime;
        this.queue = queue;
    }
    public String userIdGetter(){
        return this.userId;
    }
    public String NameGetter(){
        return patientName;
    }
    public String DepartmentGetter(){
        return department;
    }
    public String dateTimeGetter(){
        return dateTime;
    }
    public int queueGetter(){
        return queue;
    }
    public String toString(){
        return this.queue + " " + this.userId + " " + this.patientName + " " + this.department + " " + this.dateTime + " " + this.queue;
    }
}
