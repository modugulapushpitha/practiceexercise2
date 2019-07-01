package com.stackroute.exercise2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
    EvenNum testobj;
    @Before
    public void setUp(){
        testobj=new EvenNum();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void testGivenIntReturnTrue(){
        boolean res=testobj.isEven(10);
        assertEquals(true,res);
    }
    @Test
    public void testGivenIntReturnFalse(){
        boolean res=testobj.isEven(5);
        assertEquals(false,res);
    }
    @Test
    public void testGivenNegativeIntReturnFalse(){
        boolean res=testobj.isEven(-10);
        assertEquals(true,res);
    }
    @Test
    public void testGivenZeroReturnResult(){
        boolean res=testobj.isEven(0);
        assertEquals(true,res);
    }

}