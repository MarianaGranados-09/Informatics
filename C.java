/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
//Right usage of private modifier

public class C {
    private boolean x;
    //object c is used inside the class C
    public static void main(String[] args){
        C c = new C();
        System.out.println(c.x);
        System.out.println(c.convert());
    }
    private int convert()
    {
        return x ? 1 : -1;
    }
}

//Test class doesnt have access to private members
public class Test{
    public static void main(String[] args){
        C c = new C();
        System.out.println(c.x);
        System.out.println(c.convert());
    }
}
