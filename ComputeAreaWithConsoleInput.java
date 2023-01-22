/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariana
 */
import java.util.Scanner;
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args){
        //create scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt user the enter radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble(); //reads a double
        
        double area = radius * radius * 3.14159;
        System.out.println("The area for the circle of radius "+radius+" is "+area);
    }
}
