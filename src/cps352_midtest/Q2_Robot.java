/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cps352_midtest;

/**
 *
 * @author rodo
 */
public abstract class Q2_Robot {
    
    public Q2_MovementBehavior vacuumMovement;
    public Q2_MovementBehavior normalMovement;
    public Q2_MovementBehavior sawToothedMovement;
    public boolean vacuum;
    
    public abstract void move();
    
    public void suck(){
        this.vacuum = true;
    }
    
    public void mop(){
        this.vacuum = false;
    }

    public Q2_MovementBehavior getVacuumMovement() {
        return vacuumMovement;
    }

    public void setVacuumMovement(Q2_MovementBehavior vacuumMovement) {
        this.vacuumMovement = vacuumMovement;
    }

    public Q2_MovementBehavior getNormalMovement() {
        return normalMovement;
    }

    public void setNormalMovement(Q2_MovementBehavior normalMovement) {
        this.normalMovement = normalMovement;
    }

    public boolean isVacuum() {
        return vacuum;
    }

    public void setVacuum(boolean vacuum) {
        this.vacuum = vacuum;
    }

    public Q2_MovementBehavior getSawToothedMovement() {
        return sawToothedMovement;
    }

    public void setSawToothedMovement(Q2_MovementBehavior sawToothedMovement) {
        this.sawToothedMovement = sawToothedMovement;
    }
}
