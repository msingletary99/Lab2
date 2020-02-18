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

public class avgGrade {

    public static void main(String[] args) {

        System.out.println("Please Input Test 1 Score.");
        Scanner keyboard = new Scanner(System.in);
        int testOneScore = keyboard.nextInt();

        System.out.println("Please Input Test 2 Score.");
        int testTwoScore = keyboard.nextInt();

        System.out.println("Please Input Test 3 Score.");
        int testThreeScore = keyboard.nextInt();

        int avgGrade = (testOneScore + testTwoScore + testThreeScore) / 3;

            if (avgGrade > 89) {
            System.out.println("Your average is " + avgGrade + " and that is an A!");
        
            }
                if (avgGrade > 79 && avgGrade <= 89) {
                System.out.println("Your average is " + avgGrade + " and that is a B!");
                }
                
                    if (avgGrade >69 && avgGrade<=79){
                    System.out.println("Your average is " + avgGrade + " that is an C!");
                    }
                        if (avgGrade>59 && avgGrade<=69){
                        System.out.println("Your average is " + avgGrade + " that is an D!");
                        }
                            if (avgGrade<=59){
                            System.out.println("Your average is " + avgGrade + " that is an D!");
                            }
                                   
                      }

}
