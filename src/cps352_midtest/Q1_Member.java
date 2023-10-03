/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cps352_midtest;

/**
 *
 * @author rodo
 */
public abstract class Q1_Member {
    
    private int employeeID;
    private String title;
    private double payRate;
    
    public Q1_Member (int employeeID, String title, double payrate){
        this.employeeID = employeeID;
        this.title = title;
        this.payRate = payrate;
    }
    
    public void teach(){
        System.out.println("I don't teach");
    }
    
    public void print(){
        System.out.println( "EmployeeID: " + this.employeeID + " Payrate: " + this.payRate);
    }
    
    public void supervise(Q1_Member e){
        System.out.println("Method not applicable for this class");
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
