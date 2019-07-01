package com.stackroute.exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindFile {
    public static void main(String[] args)throws IOException {


        File file = new File("/home/pushpitha/exercise2/src/main/java/com/stackroute/exercise2");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String s="";
        String st;
        while ((st = br.readLine()) != null)
        {
            s+=st;
        }
        byte[] bytearr1= s.getBytes();

        System.out.println(bytearr1);
    }
}

