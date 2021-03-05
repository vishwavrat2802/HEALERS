
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VISHWAVRAT VAIBHAV
 */
public class OrderManager {
    private ArrayList<Order> order = new ArrayList<>();
    private ArrayList<Medicine> medicines = new ArrayList<>();

//    public void Add(String name, int quantity, int price) {
//        medicineorder m = new medicineorder();
//        m.name(name);
//        m.quantity(quantity);
//        m.price(price);
//        m.total(quantity * price);
//        med.add(m);
//    }

    public void getMedicines(String filename){
        try{
            BufferedReader bw=new BufferedReader(new FileReader(filename));
            String line="";
            bw.readLine();
            while((line = bw.readLine()) != null){
                String[] values = line.split(",");
                medicines.add(new Medicine(Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2])));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void order(String UserId,String medName, int quantity){
        for(Medicine med:medicines){
            if(med.getName().equals(medName)){
                order.add(new Order(UserId ,med.getMedId(),quantity,quantity * med.getPrice()));
            }
        }
        finalList("order.csv");
    }
//    public void Delete(String name) {
//        for (int i = 0; i < med.size(); i++) {
//            if (med.get(i).getName().equals(name)) {
//                med.remove(i);
//            }
//        }
//    }
    
      
//    public void Display() {
//      
//        try{
//            BufferedReader bw=new BufferedReader(new FileReader("order.csv"));
//                        String line="";
//                        while((line = bw.readLine()) != null){
//                            String[] values = line.split(",");
//                            System.out.println(values[0] + " " + values[1] + " " + values[2] + " " + values[3]);
//        
//    }
//    }
//        catch(IOException ex){
//              ex.printStackTrace();
//        }
//    
//    }
    public void finalList(String filename){
        try{
            BufferedWriter bw= new BufferedWriter(new FileWriter(filename,true));
            for (Order med1 : order) {
                bw.write(med1.toString());
                bw.newLine();
            bw.flush();
        }
    }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }   

    public List<Medicine> getMedList() {
        List<Medicine> result = null;
        
        result = Collections.unmodifiableList(this.medicines);
        return result;
    }
    
//   public void init(){
//       OrderManager m = new OrderManager();
//       m.Add("medicine5", 3, 7);
//       m.Write();
//       m.Display();
//   }

    public static void main(String[] args) {
       OrderManager OM = new OrderManager();
       OM.getMedicines("Medicines.csv");
       assert(OM.getMedList().size() == 6);
       assert(OM.getMedList().get(0).getMedId() == 62359);
    }
}
