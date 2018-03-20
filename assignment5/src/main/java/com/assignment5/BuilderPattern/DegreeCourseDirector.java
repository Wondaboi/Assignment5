package com.assignment5.BuilderPattern;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class DegreeCourseDirector {
    private DegreeCourseBuilder degreeCourseBuilder = null;

    public DegreeCourseDirector(DegreeCourseBuilder degreeCourseBuilder){
        this.degreeCourseBuilder =degreeCourseBuilder;
    }

    public void constructDegreeCourse(){
        degreeCourseBuilder.buildNurse();
        degreeCourseBuilder.buildDoctor();
    }

    public DegreeCourse getDegreeCourse(){
        return degreeCourseBuilder.getDegreeCourse();
    }
}
