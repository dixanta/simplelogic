/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.simplelogic;

/**
 *
 * @author USER
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String firstName="Dixanta";
        String lastName="Shrestha";
        String fullName=firstName + " " + lastName;
        String domain="@leapfrog.academy";
        String email=(firstName.substring(0,1) + "." + lastName + domain).toLowerCase();
        System.out.println("Name:" + fullName);
        System.out.println("Email:" +email);
        System.out.println(firstName.contains("a"));
        System.out.println(firstName.startsWith("k"));

    }

}
