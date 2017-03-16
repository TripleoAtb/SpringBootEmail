/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springmodules.mailing.rest.controllers;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springmodules.mailing.core.entity.User;
import org.springmodules.mailing.core.repositories.UserRepository;
import org.springmodules.mailing.core.services.UserService;

/**
 *
 * @author OPEYEMI
 */


@RestController  
 @RequestMapping("/users") 
public class UserController {
 
    private final static Logger logger = Logger.getLogger(UserController.class);  
   @Autowired  
   private UserService userService;  
   @Autowired  
   private UserRepository userRepository;  
   @RequestMapping(method = RequestMethod.GET)  
   public List<User> getUsers() {  
    return userRepository.findAll();  
   }  
   @RequestMapping(method = RequestMethod.POST)  
  public User addUser(@RequestBody User user) {  
    return userService.saveUser(user);  
   } 
    
}
