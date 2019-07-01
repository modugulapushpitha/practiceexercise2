package com.stackroute.exercise2;
import java.io.*;

public class FrequencyFileData {
   /* int contentOfFileTimes(String filename) throws IOException {*/
    public static void main(String[] args) throws IOException{
        File file = new File("/home/pushpitha/exercise2/src/main/java/com/stackroute/exercise2/testfile");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        String line;
        int countWord = 0;
        while ((line = reader.readLine()) != null) {
            if (!(line.equals(""))) {
                String[] wordList = line.split("\\s+");
                countWord += wordList.length;
            }
        }
        System.out.println(countWord);
    }

}
