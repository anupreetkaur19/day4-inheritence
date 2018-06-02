/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg3.java;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Day3Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      employee emp1 = new employee("rutvi", "toronto", 23,"e01", "12 may 2017",10);
      //emp1.name = "rutvi";
      //emp1.address = "toronto";
      //emp1.age = 23;
      //System.out.println("name : " + emp1.name + "\naddress : " + emp1.address + "\nage : " + emp1.age);
      System.out.println(emp1.toString());
    }
    
}
