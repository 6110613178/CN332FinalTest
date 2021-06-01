/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn332finaltest;

/**
 *
 * @author Teerat Prasitwet
 */
public class GoogleUserAccount extends UserAccount {
    private String googleEmail;
    
    public void setEmail(){
        //dummy add email from google
        email = googleEmail;
    }
}
