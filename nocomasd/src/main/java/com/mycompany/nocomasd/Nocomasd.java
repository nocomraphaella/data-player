/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nocomasd;
import java.util.Scanner;
/**
 *
 * @author CL3-PC30
 */
public class Nocomasd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p1, p2;
        System.out.println("[1] = Rock");
        System.out.println("[2] = Paper");
        System.out.println("[3] = Scissor");
        
        System.out.print("Enter Player 1:");
        p1 = input.nextInt();
        System.out.print("Enter Player 2:");
        p2 = input.nextInt();
        
        
        if(p1==1&&p2==1)
        {
            System.out.println("Draw:");
        }
        
        else if(p1==1&&p2==2)
        {
            System.out.println("Player 2 Wins:");
        }
        
        else if(p1==1&&p2==3)
        {
            System.out.println("Player 1 Wins:");
        }
        
        //Paper
        else if(p1==2&&p2==1)
        {
            System.out.println("Player 1 Wins:");
        }
        
        else if(p1==2&&p2==2)
        {
            System.out.println("Draw:");
        }
        
        else if(p1==2&&p2==3)
        {
            System.out.println("Player 2 Wins:");
        }
        
        //Scissor
        else if(p1==3&&p2==1)
        {
            System.out.println("Player 2 Wins:");
        }
        
        else if(p1==3&&p2==2)
        {
            System.out.println("Player 1 Wins:");
        }
        
        else if(p1==3&&p2==3)
        {
            System.out.println("Draw:");
        }
    }
}
