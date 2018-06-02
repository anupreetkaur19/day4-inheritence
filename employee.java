/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg3.java;

/**
 *
 * @author macstudent
 */
public class employee extends person{
    String eID;
    String joiningDate;
    int deptno;
    
    employee(){
        super();
        this.eID = "E000";
        this.joiningDate = "DD MON YYYY";
this.deptno = 0;
    }
    employee(String name, String address, int age,String eID, String joiningDate, int deptno){
        super(name, address, age);
        this.eID = eID;
        this.joiningDate = joiningDate;
        this.deptno = deptno;
      
    }
    
     @Override 
     public String toString(){
         String personalDetails = super.toString();
         String data = "Employee ID  : " + this.eID + "\n joining date : " + this.joiningDate + "\n dept no : " + this.deptno;

return personalDetails + data;
     }
}
