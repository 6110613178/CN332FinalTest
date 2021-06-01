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
public class CheckNormalPassword implements CheckUserPassword {
    private String email;
    private String password;
    private String dummyEmail = "CN332@cn.com";
    private String dummyPassword = "CN332";
    
    public CheckNormalPassword(String lEmail, String lPassword){
        email = lEmail;
        password = lPassword;
    }
    
    public boolean check(){
        if ((email == dummyEmail)&&(password == dummyPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
