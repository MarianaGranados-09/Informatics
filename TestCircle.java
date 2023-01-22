/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class TestCircle {
    public static void main(String[] args){
        Circle circle1 = new Circle();
        System.out.println("Area of circle1: "+circle1.getArea());
         
        Circle circle2 = new Circle(25);
        System.out.println("Perimeter of circle2: "+circle2.getPerimeter());
        
        circle2.setRadius(100); 
    }
}

class Circle{
    double radius; //data field
    
    //Construct a circle with radius 1
    Circle(){
        radius = 1;
    }
    //Construct a circle with a specific radius
    Circle(double newRadius){
        radius = newRadius; //second constructor
    }
    
    //Methods
    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }
}
