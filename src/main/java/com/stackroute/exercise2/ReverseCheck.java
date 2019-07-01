package com.stackroute.exercise2;

public class ReverseCheck {
    public int reverseinput(int input){
        int mod=0,sum=0;
        while(input>0) {
            mod = input % 10;
            sum = sum * 10 + mod;
            input = input / 10;
        }
        return sum;
        }
    public String checkInput(int input){
        int revnum=reverseinput(input);
        String output;
        if(input==revnum){
    output="palindrome";

        }
        else{
            output="not a palindrome";
        }
        return output;
    }

}
