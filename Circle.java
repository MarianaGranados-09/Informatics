/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */

/*
    A private data field cant be accessed by an object from outside the class
that defines the private field. Yo male a private data field accessible, provide a getter
method to return its value. To enable a private data field to be updated, provide a setter
method to set a new value. A getter method is also referred to as an accesor and a setter to a mutator

*/
public class Circle {
    public static void main(String[] args){ 
        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle();
        System.out.println("Area of c1 is "+c1.getArea());
        System.out.println(numberOfCircles);
        System.out.println("radius of c2 is "+c2.getRadius());
    }
    private double rad = 1; //encapsulate radius
    private static int numberOfCircles = 0;
    
    //construct a circle with radius 1
    public Circle(){
        numberOfCircles++;
    }
    //construct a circle with a specified radius
    public Circle(double newRad){
        rad = newRad;
        numberOfCircles++;
    }
    //return radius
    public double getRadius(){
        return rad;
    }
    //set a new radius
    public void setRadius(double newRad){
        rad = (newRad >= 0) ? newRad : 0;
    }
    //return number of circles
    public static int getnumberOfCircles(){
        return numberOfCircles;
    }
    //return area
    public double getArea(){
        return rad * rad * Math.PI;
    }
}
