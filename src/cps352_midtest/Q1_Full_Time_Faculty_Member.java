/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cps352_midtest;

import java.util.ArrayList;

/**
 *
 * @author rodo
 */
public class Q1_Full_Time_Faculty_Member extends Q1_Member {

    ArrayList<Q1_Teaching_Assistant> supervised = new ArrayList<Q1_Teaching_Assistant>();
    
    Q1_Full_Time_Faculty_Member(int employeeID, String title, double payrate) {
        super(employeeID, title, payrate);
    }

    public void supervise(Q1_Teaching_Assistant e){
        supervised.add(e);
    }
    
    @Override
    public void teach(){
        System.out.println("Teaching as Full-Time Faculty Member");
    }
}
