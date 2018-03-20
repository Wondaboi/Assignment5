package com.assignment5.BuilderPattern;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class ThirdYearDegreeCourseBuilder implements DegreeCourseBuilder {
    private DegreeCourse degreeCourse;

    public ThirdYearDegreeCourseBuilder(){
        degreeCourse = new DegreeCourse();
    }

    public void buildNurse() {
        degreeCourse.setNurse("Nurse: 003");
    }

    public void buildDoctor() {
        degreeCourse.setDoctor("Doctor:003");
    }

    public DegreeCourse getDegreeCourse() {
        return degreeCourse;
    }
}
