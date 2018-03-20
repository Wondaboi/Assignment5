package com.assignment5.Prototype;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class TestPrototype {

    public static void main(String[]args)
    {
        Inventor genius = new Inventor ("Adam", "Riddle");         //Objects to clone
        Invention showerHead = new Invention("Shower Head",002);    //Objects to clone

        Inventor newGenius = (Inventor) genius.createCopy();                    //Clone objects
        Invention newShowerHead = (Invention) showerHead.createCopy();          //Clone objects

        System.out.println(genius.toString());
        System.out.println(newGenius.toString());

        System.out.println(showerHead.toString());
        System.out.println(newShowerHead.toString());
    }
}
