package com.stackroute.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseCheckTest {
    ReverseCheck testobj;

    @org.junit.Before
    public void setUp() throws Exception {
        testobj=new ReverseCheck();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        testobj=null;
    }
    @Test
    public void givenIntShouldReturnMessage(){
        int reverse=testobj.reverseinput(121);
        assertEquals(121,reverse);
        String res=testobj.checkInput(121);
        assertEquals("palindrome",res);
    }

}