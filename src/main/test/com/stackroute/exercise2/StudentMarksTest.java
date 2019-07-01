package com.stackroute.exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks testobj;
    @Before
    public void setUp(){
        testobj=new StudentMarks();
    }
    @After
    public void  tearDown(){
        testobj=null;
    }
    @Test
    public void givenStudentDataShouldReturnoutput(){
        float[] result=testobj.studentData(4,new int[]{86,87,88,89});
        assertArrayEquals(new float[]{87.5f,86,89},result,2);

    }

    }
