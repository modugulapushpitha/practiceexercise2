package com.stackroute.exercise2;

public class Factorial {
public long findFactorial(int input){
    long output=1;
    if(input<1)
    {
        for(int i=-1;i>=input;i--){
            output=output*i;
        }
    }
    else {
        for (int i = 1; i <= input; i++) {
            output = output * i;
        }
    }
    return output;

}
}
