/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment1;

import java.util.Scanner;

/**
 *
 * @author dteel
 */
public class LabAssignment1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String speed = "What is your speed, in miles per hour, to the nearest integer?";
        Scanner sc = new Scanner(System.in);
        System.out.println(speed);
        int speedInput = sc.nextInt();
        float S = speedInput;
        
        String distance = "How far did you travel, in miles, to the nearest integer?";
        System.out.println(distance);
        int distanceInput = sc.nextInt();
        float D = distanceInput;
        
        System.out.println("You traveled " + D + " miles at a speed of " + S + " miles per hour.");
        
    }
    
}
