/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VISHWAVRAT VAIBHAV
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JFrame;

public class AppointmentManager {
    private ArrayList<Appointment> LI = new ArrayList<>();
    
    int count = 1;
    public void Add(String userId, String name, String department, String dateTime) {
        LI.add(new Appointment(LI.size()+1,userId, name,department,dateTime));
        Write("appointments.csv");
    }

    public void allAppointments(){
        try{
            BufferedReader bw=new BufferedReader(new FileReader("appointments.csv"));
            String line="";
            while((line = bw.readLine()) != null){
                String[] values = line.split(",");
    //            int queue = Integer.parseInt(values[0]);
    //            temp.add(new Appointment(values[1],values[2],values[3],Integer.valueOf(values[0])));
    //            System.out.print(Integer.valueOf((values[0])));
                LI.add(new Appointment(Integer.parseInt(values[0]),values[1],values[2],values[3],values[4]));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public List<Appointment> getAppointmentsList() {
        List<Appointment> result = null;
        result = Collections.unmodifiableList(this.LI);
        return result;
    }
    
    public void Write(String filename){
        try{
            BufferedWriter bw= new BufferedWriter(new FileWriter(filename));
            for (Appointment LI1 : LI) {
                bw.write(LI1.queueGetter() + "," +LI1.userIdGetter() + "," + LI1.NameGetter() + "," + LI1.DepartmentGetter() + "," + LI1.dateTimeGetter());
                bw.newLine();
            }
            bw.flush();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
//    public void delete(int queue){
//        
//    }
    public void init(){
        
    }

    public static void main(String[] args) throws IOException {
        
        new AppointmentManager().init();
        //m.Delete("Sope");
//        m.Display();
        AppointmentManager m = new AppointmentManager();
    }
}
