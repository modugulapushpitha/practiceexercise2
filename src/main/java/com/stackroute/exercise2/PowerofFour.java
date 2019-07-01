package com.stackroute.exercise2;

public class PowerofFour {
    public String checkInput(int input){

            if(input == 0) {
                return "not power of four";
            }
            while(input != 1)
            {
                if(input % 4 != 0) {
                    return "not power of four";
                }
                input = input / 4;
            }
            return "power of four";

        }

    }
