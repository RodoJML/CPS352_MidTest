/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cps352_midtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Q1_Department_Chair extends Q1_Member {
    
    List<Q1_Member> supervised = new ArrayList<Q1_Member>();
    
    Q1_Department_Chair(int employeeID, String title, double payrate){
        super(employeeID, title, payrate);
    }
    
    @Override
    public void print(){
        super.print();
        Iterator<Q1_Member> memberIterator = supervised.iterator();
        while(memberIterator.hasNext()){
            memberIterator.next().print();
        }
    }
    
    @Override
    public void supervise(Q1_Member e){
        supervised.add(e);
    }
}
