
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
public class User {
    private String userId = null;
    private String name = null;
    private String email = null;
    private String mobNo = null;
    private String password = null;
    public User(String userId, String name, String email, String mobNo, String password){
        this.userId=userId;
        this.name=name;
        this.email=email;
        this.mobNo=mobNo;
        this.password=password;
    }
    public String getUserId(){
        return userId;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getMobNo(){
        return mobNo;
    }
    public String getPassword(){
        return password;
    }
    public String toString(){
        return this.userId + "," + this.name + "," + this.email + "," + this.mobNo + "," + this.password; 
    }
}
