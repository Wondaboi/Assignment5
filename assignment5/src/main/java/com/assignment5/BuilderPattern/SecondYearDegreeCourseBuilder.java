package com.assignment5.BuilderPattern;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class SecondYearDegreeCourseBuilder implements DegreeCourseBuilder {
    private DegreeCourse degreeCourse;

    public SecondYearDegreeCourseBuilder(){
        degreeCourse = new DegreeCourse();
    }

    public void buildNurse() {
        degreeCourse.setNurse("Nurse: 002");
    }

    public void buildDoctor() {
        degreeCourse.setDoctor("Doctor: 002");
    }

    public DegreeCourse getDegreeCourse() {
        return degreeCourse;
    }
}
