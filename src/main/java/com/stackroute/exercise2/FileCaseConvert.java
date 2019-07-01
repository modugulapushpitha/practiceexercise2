package com.stackroute.exercise2;
import java.io.FileReader;
public class FileCaseConvert {
    public static void main(String[] args) throws Exception {

        // pass the path to the file as a parameter
        FileReader fr = new FileReader("/home/pushpitha/exercise2/src/main/java/com/stackroute/exercise2/testfile");

        int i;
        int count=0;
        while ((i = fr.read()) != -1) {
            count++;
            System.out.print((Character.toUpperCase((char) i)));

        }
        System.out.println(count);
    }
}
