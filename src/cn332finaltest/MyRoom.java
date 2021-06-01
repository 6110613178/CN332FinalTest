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
public class MyRoom {
    String roomType;
    String bedType;
    boolean wifi;
    int peopleCount;
    String dateIn;
    String dateOut;
    int price = 0;
    String payOut;
    
    public MyRoom(String roomType, String bedType, boolean wifi, int peopleCount, String dateIn, String dateOut, String payOut){
        this.roomType = roomType;
        this.bedType = bedType;
        this.wifi = wifi;
        this.peopleCount = peopleCount;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.payOut = payOut;
    }
    
    public void calPrice(){
        //room type price
        if (roomType == "Standard"){
            price += 1000;
        } else if (roomType == "VIP"){
            price += 2500;
        }
        //bed price
        if (bedType == "Single"){
            price += 100;
        } else if (roomType == "Couple"){
            price += 300;
        }
        //wifi price
        if (wifi == true){
            price += 50;
        }
        //people price
        price += peopleCount * 100;
        //date price
        price *= Integer.valueOf(dateOut) - Integer.valueOf(dateIn);
        if (payOut == "Krungthai"){
            price = (int)(price*0.9);
        }
    }
    
    public int getRoomPrice(){
        return price;
    }
    
}
