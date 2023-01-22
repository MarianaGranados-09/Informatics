/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariana
 */
import java.util.Scanner;
public class string {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        //next() method reads a string that ends with a whitespace character
        //nextLine() method to read an entire line of text
        System.out.println("s1 is "+ s1);
        System.out.println("s2 is "+ s2);
        System.out.println("s3 is "+ s3);
    }
}
