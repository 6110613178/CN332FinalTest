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
public class UserAccount {
    protected String email;
    protected String password;
    protected MyRoom room;
    protected int price;
    
    public boolean login(String lEmail, String lPassword){
        CheckNormalPassword pwd = new CheckNormalPassword(lEmail, lPassword);
        if (pwd.check()){
            email = lEmail;
            password = lPassword;
            return true;
        } else {
            return false;
        }
    }
    public void book(String roomType, String bedType, boolean wifi, int peopleCount, String dateIn, String dateOut, String payOut){
        MyRoom room = new MyRoom(roomType, bedType, wifi, peopleCount, dateIn, dateOut, payOut);
        room.calPrice();
        price = room.getRoomPrice();
    }
    
    public int getPrice(){
        return price;
    }
}
