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
public class Check2Authentication implements CheckUserPassword {
    private String email;
    private String password;
    
    public Check2Authentication(String lEmail, String lPassword){
        email = lEmail;
        password = lPassword;
    }
    
    public boolean check(){
        //Dummy API check
        return true;
    }
}
