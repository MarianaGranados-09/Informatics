/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.*;

/**
 *
 * @author maria
 */
public class ProductApp {
    public static void main(String[] args){
        System.out.println("Welcome to the Product App");
        System.out.println();
        
        //create 1 or more line items
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y")){
            System.out.println("Enter product code: ");
            String productCode = sc.nextLine();
            
            //get the product object
            Product product = ProductDB.getProduct(productCode);
            
            //display output
            String message = "\nPRODUCT\n"+
                    "Code:          "+ product.getCode()+"\n"+
                    "Description:   "+product.getDescription()+"\n"+
                    "Price:         "+product.getPriceFormatted()+"\n";
            System.out.println(message);
            
            //see if user wants to continue
            System.out.println("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("See u next time!");
      }
    }


