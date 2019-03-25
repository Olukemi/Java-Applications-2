/*
 * Name: Kemi
 * Date: March 25th 2019
 * Version: v0.01
 * Description: This program tells the user whether their side make of is a vaild triangle and if so 
tells them if it's an actual right angle triangle. 
This program has the user enter three lengths of sides and determines whether the 
figure is a triangle or not.  If a triangle can be formed, it will determine if it is a right-triangle.
 */
package edu.hdsb.gwss.kemi.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //CONSTANTS: N/A
        
        //VARIABLES: N/A
        double hypoth = 0;
        
        //SPLASH PAGE:
        System.out.println("TRIANGLES\nThree numbers represent the side lengths "
                + "\nof a triangle when the sum of any two sides is greater than the third side.");
        System.out.println("RIGHT TRIANGLES\nA right-angled triangle has the "
                + "\nproperty that when the values of the lengths of the sides are "
                + "\nsquared, the sum of two smaller values is equal to the larger value.");
        System.out.println("--------------------------------------------------------------------");

        //INPUT:
        System.out.println("Enter side length #1(cm):");
        double sideLenght1 = input.nextDouble();
        System.out.println("Enter side length #2(cm):");
        double sideLenght2 = input.nextDouble();
        System.out.println("Enter side length #3(cm):");
        double sideLenght3 = input.nextDouble();
        
        //PROCESSING & //OUTPUT:
        if ((sideLenght1 + sideLenght2) >= sideLenght3 && (sideLenght2 + sideLenght3) >= sideLenght1 && (sideLenght1 + sideLenght3) >= sideLenght2){
            System.out.println("These sides CAN make a triangle!");
            if (sideLenght1 > sideLenght2 && sideLenght1 > sideLenght3){
                hypoth = sideLenght1;
                if (hypoth == Math.sqrt((sideLenght2 * sideLenght2) + (sideLenght3 * sideLenght3))){
                    System.out.println("These sides CAN make a RIGHT ANGLE triangle!");
                }
            }
            else if (sideLenght2 > sideLenght1 && sideLenght2 > sideLenght3){
                hypoth = sideLenght2;
                if (hypoth == Math.sqrt((sideLenght1 * sideLenght1) + (sideLenght3 * sideLenght3))){
                    System.out.println("These sides CAN make a RIGHT ANGLE triangle!");
                }
            }
            else if (sideLenght3 > sideLenght2 && sideLenght3 > sideLenght1){
                hypoth = sideLenght3;
                if (hypoth == Math.sqrt((sideLenght2 * sideLenght2) + (sideLenght1 * sideLenght1))){
                    System.out.println("These sides CAN make a RIGHT ANGLE triangle!");
                }
            }
            else if (sideLenght1 > sideLenght2){
                System.out.println("These sides CANNOT make a RIGHT ANGLE triangle:(");
            }
        }
        else if ((sideLenght1 + sideLenght2) < sideLenght3 || (sideLenght2 + sideLenght3) < sideLenght1 || (sideLenght1 + sideLenght3) < sideLenght2) {
            System.out.println("These sides CANNOT make a triangle:(");
        }
    }
    
}
