/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cps352_midtest;

/**
 *
 * @author rodo
 */
public class Q2_CleaningRobot extends Q2_Robot {
    
    @Override
    public void move(){
        if(this.vacuum){   
            this.vacuumMovement.move(true);
        }else{
            this.normalMovement.move(true);
            this.sawToothedMovement.move(true);
        }
    }
}
