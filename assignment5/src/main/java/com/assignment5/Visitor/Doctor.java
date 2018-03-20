package com.assignment5.Visitor;

/**
 * Created by ajpGa on 2018/03/20.
 */
public class Doctor {

    int numVisits;

    public Doctor(int visits){
        this.numVisits = visits;
    }

    public void record(VisitorLog visitor) {
        visitor.visit(this);
    }

    public void setNumVisits(int numVisits) {
        this.numVisits = numVisits;
    }

    public int getNumVisits() {
        return numVisits;
    }

}
