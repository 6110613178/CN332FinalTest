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
public class FacebookUserAccount extends UserAccount {
    private String facebookEmail;
    
    public void setEmail(){
        //dummy add email from facebook
        email = facebookEmail;
    }
}
