package com.assignment5.BuilderPattern;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class DegreeCourse {
    private String nurse;
    private String doctor;

    public String getNurse() {
        return nurse;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Degree Course{" +
                "buildNurse='" + nurse + '\'' +
                ", ; buildDoctor='" + doctor + '\'' + '}';
    }
}
