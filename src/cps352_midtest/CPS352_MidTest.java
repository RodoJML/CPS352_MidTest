/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cps352_midtest;

/**
 *
 * @author rodo
 */
public class CPS352_MidTest {

    public static void main(String[] args) {
        
        
        // Question 1 ----------------------------------------------------------
        
        Q1_Member departmentChair      = new Q1_Department_Chair(111, "Dept. Chair", 100);
        Q1_Member fullProfessor        = new Q1_Full_Time_Faculty_Member(123, "Full-Professor", 32);
        Q1_Member associateProfessor1  = new Q1_Full_Time_Faculty_Member(124, "Associate-Professor", 33);
        Q1_Member associateProfessor2  = new Q1_Full_Time_Faculty_Member(125, "Associate-Professor", 34);
        Q1_Member lecturer             = new Q1_Full_Time_Faculty_Member(127, "Lecturer", 36);
        Q1_Member secretary            = new Q1_Secretary(334, "Secretary", 44.5);
        Q1_Member teachAssistant1      = new Q1_Teaching_Assistant(222, "Teaching Assistant", 22);
        Q1_Member teachAssistant2      = new Q1_Teaching_Assistant(223, "Teaching Assistant", 22);
        Q1_Member teachAssistant3      = new Q1_Teaching_Assistant(224, "Teaching Assistant", 22);
        Q1_Member teachAssistant4      = new Q1_Teaching_Assistant(225, "Teaching Assistant", 22);
        Q1_Member teachAssistant5      = new Q1_Teaching_Assistant(226, "Teaching Assistant", 22);
        Q1_Member teachAssistant6      = new Q1_Teaching_Assistant(227, "Teaching Assistant", 22);
        Q1_Member teachAssistant7      = new Q1_Teaching_Assistant(228, "Teaching Assistant", 22);
        
        Q1_Member[] computerScienceDept = 
        { 
            departmentChair, fullProfessor, associateProfessor1, associateProfessor2,
            lecturer, secretary, teachAssistant1, teachAssistant2, teachAssistant3,
            teachAssistant4, teachAssistant5, teachAssistant6, teachAssistant7
        };
        
        for(int i = 1; i < computerScienceDept.length; i++){
            departmentChair.supervise(computerScienceDept[i]);
        }
        
        departmentChair.print();
        
        
        // Question 2 ----------------------------------------------------------
        
        Q2_Robot cleaningRobot = new Q2_CleaningRobot();

        Q2_MovementBehavior nm = new Q2_NormalMovement();
        Q2_MovementBehavior vm = new Q2_VacuumMovement();
        Q2_MovementBehavior sm = new Q2_SawToothedMovement();
        
        // Set behaviors to our cleaning robot 
        cleaningRobot.setNormalMovement(nm);
        cleaningRobot.setVacuumMovement(vm);
        cleaningRobot.setSawToothedMovement(sm);
        
        // Will move straight and saw toothed 
        cleaningRobot.move();
        
        // When setting vacuum on, if obstable detected will move left or rigth
        cleaningRobot.setVacuum(true);
        cleaningRobot.move();
    }
}
