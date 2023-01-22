/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariana
 */
//method definitions:
//modifier returnValueType methodName(list of parameters)
public class methods {
    public static void main(String[] args){
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The max of "+i+" and "+j+" is "+k);

    }
    
    public static int max(int num1, int num2){
        int result;
        if(num1 > num2)
            result = num1;
        else
            result = num2;
        
        return result;
    }
}
