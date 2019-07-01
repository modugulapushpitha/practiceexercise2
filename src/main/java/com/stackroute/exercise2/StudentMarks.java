package com.stackroute.exercise2;
import java.util.Scanner;
public class StudentMarks {
    public float[] studentData(int n, int[] array) {
        float[] result = new float[3];
        int sum = 0;
        float avg;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        avg = sum / n;
        result[0] = avg;
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        result[1] = min;
        int max = array[0];
        for (int i = 0; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        result[2] = max;
        return result;
    }
}
