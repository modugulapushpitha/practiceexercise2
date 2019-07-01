package com.stackroute.exercise2;

import com.stackroute.exercise2.PowerofFour;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerofFourTest {
    PowerofFour testobj;
    @Before
    public void setUp(){
        testobj=new PowerofFour();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void givenIntegerShouldReturnmessage(){
        String res=testobj.checkInput(16);
        assertEquals("power of four",res);
    }
    @Test
    public void givenNegativeIntegerReturnmessage(){
        String res=testobj.checkInput(-16);
        assertEquals("not power of four",res);
    }
    @Test
    public void givenZeroShouldReturnmessage(){
        String res=testobj.checkInput(0);
        assertEquals("not power of four",res);
    }



}