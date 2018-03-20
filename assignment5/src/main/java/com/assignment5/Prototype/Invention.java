package com.assignment5.Prototype;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class Invention implements Prototype {

    private String name;
    private int code;

    public Invention(String name, int code){
        this.name = name;
        this.code = code;
    }


    public Prototype createCopy() {
        return new Invention(name, code);
    }

    @Override
    public String toString() {
        return ("Invention Details: \nCode: " + code + "\nName: " + name);
    }
}
