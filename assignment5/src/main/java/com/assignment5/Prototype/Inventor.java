package com.assignment5.Prototype;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class Inventor implements Prototype {


    private String fname;
    private String lname;

    public Inventor(String fname, String lname){
        setFname(fname);
        setLname(lname);
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public Prototype createCopy() {
        return new Inventor(fname, lname);
    }

    @Override
    public String toString() {
        return ("Inventors Name: \nName: " + fname + "\nSurname:" + lname);
    }
}
