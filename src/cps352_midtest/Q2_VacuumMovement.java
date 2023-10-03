/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cps352_midtest;

/**
 *
 * @author rodo
 */
public class Q2_VacuumMovement implements Q2_MovementBehavior{

    @Override
    public void move(boolean obstacle) {
        if(obstacle)
            System.out.println("Move left and right");
        else
            System.out.println("Move straight");
    }
    
}
