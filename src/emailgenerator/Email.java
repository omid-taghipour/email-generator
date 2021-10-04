/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailgenerator;

import java.nio.charset.Charset;
import java.util.Random;

/**
 *
 * @author omid
 */
public class Email {
    String company;
    String address;
    String alt_mail;
    Employee employee;
    Integer mail_capacity;
    String password;
    

    public Email(String company, String alt_mail, Employee employee, Integer mail_capacity) {
        this.company = company;
        this.alt_mail = alt_mail;
        this.employee = employee;
        this.mail_capacity = mail_capacity;
        this.password = random_password_generator();
        this.address = employee.getFirst_name()+"."+employee.getLast_name()+"@";
        if (employee.getDepartment().toString().equals("none")) {
            this.address+=company+".com";
        }else{
            this.address+=employee.getDepartment().toString().toLowerCase()+"."+company+".com";
        }
    }

    @Override
    public String toString() {
        return "The Email address is: "+address+"\n"
                + "The Password is: "+ password+"\n"
                + "The Email belongs to: "+employee.getFirst_name()+" "+employee.getLast_name()+"\n"
                + "The Alternative email is: "+alt_mail+"\n"
                + "The Mail Capacity is: "+mail_capacity; 
    }

    private String random_password_generator() {
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAlt_mail(String alt_mail) {
        this.alt_mail = alt_mail;
    }

    public void setMail_capacity(Integer mail_capacity) {
        this.mail_capacity = mail_capacity;
    }

    public String getAddress() {
        return address;
    }

    public String getAlt_mail() {
        return alt_mail;
    }


    public Integer getMail_capacity() {
        return mail_capacity;
    }

}
