/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cps352_midtest;

/**
 *
 * @author rodo
 */
public class Q1_Teaching_Assistant extends Q1_Member {
    
    public Q1_Teaching_Assistant(int employeeID, String title, double payrate){
        super(employeeID, title, payrate);
    }
    
    @Override
    public void teach() {
        System.out.println("Teaching as Teaching Assistant"); 
    }
}
