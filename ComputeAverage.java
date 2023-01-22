/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariana
 */
import java.util.*;

public class ComputeAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        double no1 = input.nextDouble();
        double no2 = input.nextDouble();
        double no3 = input.nextDouble();
        
        double average = (no1 + no2 + no3) / 3;
        System.out.println("The average of "+no1 +" "+no2+" "+no3+" is "+ average);
        
    }
}
