/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springmodules.mailing.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author OPEYEMI
 */

@Entity  
public class User {
    
     @Id  
    @GeneratedValue  
    private Long id;  
   private String name;  
   private String email;  // email is equivalent to loguin in this case  
    private String password;  
   public Long getId() {  
     return id;  
   }  
    public void setId(Long id) {  
     this.id = id;  
    }  
    public String getName() {  
      return name;  
    }  
    public void setName(String name) {  
      this.name = name;  
   }  
    public String getEmail() {  
     return email;  
    }  
   public void setEmail(String email) {  
      this.email = email;  
    }  
    public String getPassword() {  
     return password;  
    }  
   public void setPassword(String password) {  
      this.password = password;  
    }  
    
    
    
}
