package com.assignment5.BuilderPattern;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class FirstYearDegreeCourseBuilder implements DegreeCourseBuilder {
    private DegreeCourse degreeCourse;

    public FirstYearDegreeCourseBuilder(){
        degreeCourse = new DegreeCourse();
    }

    public void buildNurse() {
        degreeCourse.setNurse("Nurse: 001");
    }

    public void buildDoctor() {
        degreeCourse.setDoctor("Doctor: 001");
    }

    public DegreeCourse getDegreeCourse() {
        return degreeCourse;
    }
}
