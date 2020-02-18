/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
import java.util.Scanner;

public class bankFees {

    public static void main(String[] args) {

        System.out.println("Please input the number of checks written.");
        Scanner keyboard = new Scanner(System.in);
        int checksWritten = keyboard.nextInt();
        double baseFee = 10.00;
        double totalFees;

        if (checksWritten < 20) {
            totalFees = baseFee + (.10 * checksWritten);
        } else if (checksWritten >= 20 && checksWritten <= 39) {
            totalFees = baseFee + (.08 * checksWritten);
            } else if (checksWritten>=40 && checksWritten<=59){ 
                totalFees= baseFee+(.06*checksWritten);
                 }else totalFees=baseFee+(.04*checksWritten);
 
        System.out.println("Your total fee is $"+ totalFees);
}
}
