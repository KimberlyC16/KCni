/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

/**
 *
 * @author SCC-COLLEGE
 */
public class session {
   
   private static session instance;
   private String id;
   private String email;
   private String usernames;
   private String passwords;
   private String contact;
   private String status;
 
   
   private session(){
       
   }

    public static synchronized session getInstance() {
        if(instance == null){
            instance = new session();
        }
        return instance;
    }

    public static boolean isInstanceEmpty(){
        return instance==null;
    }

    public String getEmail() {
        return email;
    }
    

    public void setEmail(String email) {
        this.email = email;
    }
        public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsernames() {
        return usernames;
    }

    public void setUsernames(String usernames) {
        this.usernames = usernames;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        
 
}
