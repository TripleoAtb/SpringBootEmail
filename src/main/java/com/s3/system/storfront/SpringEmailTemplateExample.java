/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s3.system.storfront;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author OPEYEMI
 */
public class SpringEmailTemplateExample {
    
    public static void main(String[] args) {
  Mail mail = new Mail();
  mail.setMailFrom("oopeyemi@atbtechsoft.com");
mail.setMailTo("tripleo4real82@gmail.com");
  mail.setMailSubject("Subject - Send Email using Spring Velocity Template");
  mail.setTemplateName("emailtemplate.vm");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");      
  Mailer mailer = (Mailer) context.getBean("mailer");
  mailer.sendMail(mail);

 }

    
}
