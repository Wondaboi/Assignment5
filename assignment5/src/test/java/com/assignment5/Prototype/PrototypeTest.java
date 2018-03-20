package com.assignment5.Prototype;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by ajpGa on 2018/03/20.
 */
public class PrototypeTest extends TestCase {
    public void testCreateCopy() throws Exception {

        Inventor inventor = new Inventor ("adam", "james");
        Inventor newInventor = (Inventor) inventor.createCopy();

        Assert.assertEquals(inventor.toString(), newInventor.toString());
    }
}