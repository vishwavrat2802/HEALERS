
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VISHWAVRAT VAIBHAV
 */
public class UserManager {
    private ArrayList<User> user = new ArrayList<>();
    CryptWithMD5 CryptWithMD5 = new CryptWithMD5();
    public void allUsers(String filename){
        try{
            BufferedReader bw=new BufferedReader(new FileReader(filename));
            String line="";
            bw.readLine();
            while((line = bw.readLine()) != null){
                String values[] = line.split(",");
                user.add(new User(values[0],values[1],values[2],values[3],values[4]));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public boolean addNewUser(String name, String email, String mobNo, String password){
        boolean result=true;
        for(User user:user){
            if(user.getEmail().equals(email) || user.getMobNo().equals(mobNo)){
                result = false;
                break;
            }
        }
        if(result){
            UUID uuid=UUID.randomUUID();
            user.add(new User(String.valueOf(uuid), name,email,mobNo,CryptWithMD5.cryptWithMD5(password)));
            saveUser("user.csv");
        }
        return result;
    }
    public void saveUser(String filename){
        try{
            BufferedWriter bw= new BufferedWriter(new FileWriter(filename));
            for (User user : user) {
                bw.write(user.toString());
                bw.newLine();
            bw.flush();
        }
    }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public String login(String data, String password){
        String userId=null;
        for(User user:user){
            if(user.getEmail().equals(data) || user.getMobNo().equals(data)){
                if(user.getPassword().equals(CryptWithMD5.cryptWithMD5(password))){                    
                    userId = user.getUserId();
                }
            }
        }
        return userId;
    }
    public String userName(String userId){
        String userName=null;
        for(User user:user){
            if(user.getUserId().equals(userId)){
                userName=user.getName();
            }
        }
        return userName;
    }
    
    public static void main(String[] args) {
       UserManager UM = new UserManager();       
       UM.allUsers("user.csv");
    }
}
