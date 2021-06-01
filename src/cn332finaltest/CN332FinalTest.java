/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn332finaltest;

import java.util.Scanner;

/**
 *
 * @author Teerat Prasitwet
 */
public class CN332FinalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to HotelCalifonia!\nEnter your email: ");
        String email = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        UserAccount userAcc = new UserAccount();
        if (userAcc.login(email, password)){
            System.out.println("Your welcome " + email + "!");
        } else {
            System.out.println("Invalid email or password");
        }
        System.out.println("Select your room type (Standard/VIP): ");
        String roomType = sc.nextLine();
        System.out.println("Select your bed type (Single/Couple): ");
        String bedType = sc.nextLine();
        System.out.println("Do you want Wifi? (y/n): ");
        String wifiQ = sc.nextLine();
        boolean wifi = false;
        if (wifiQ == "y"){
            wifi = true;
        }
        System.out.println("How many your gang? (1-4): ");
        int peopleCount = Integer.valueOf(sc.nextLine());
        System.out.println("What is your check in date? (1-31): ");
        String dateIn = sc.nextLine();
        System.out.println("What is your check out date? (1-31): ");
        String dateOut = sc.nextLine();
        System.out.println("What is your choice to pay? (Krungthai/Bangkok): ");
        String payOut = sc.nextLine();
        userAcc.book(roomType, bedType, wifi, peopleCount, dateIn, dateOut, payOut);
        int price = userAcc.getPrice();
        String priceStr = Integer.toString(price);
        System.out.println("Finish! your price is " + priceStr);
        
    }
    
}
