package com.assignment5.Visitor;

import java.util.List;

/**
 * Created by ajpGa on 2018/03/20.
 */
public interface VisitorLog {
    public void visit(Doctor doctor);
    public void visit(Dentist dentist);
    public void visit(List<Visitor> visitorList);
}
