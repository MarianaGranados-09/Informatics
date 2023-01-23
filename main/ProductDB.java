/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author maria
 */
 public class ProductDB{
        public static Product getProduct(String productCode){
            //create Product object 
             Product product = new Product();
            
            //fill the Product object with data
            product.setCode(productCode);
            if(productCode.equalsIgnoreCase("APPLES")){
                
                product.setDescription("Red american apples");
                product.setPrice(3.20);
            }
            else if(productCode.equalsIgnoreCase("BERRIES"))
            {
                product.setDescription("Blueberries from CA");
                product.setPrice(21.30);
            }
            else if(productCode.equalsIgnoreCase("WATERMELON")){
                product.setDescription("Watermelon slices");
                product.setPrice(12.0);
            }
            else{
                product.setDescription("unknown");
            }
            return product;    
        }
 }
