package com.javastudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TaskEvaluation {
    private static final String FILE_NAME = "src/main/resources/text.txt";

    public static int countOcurrences(String word) throws FileNotFoundException{
        File file = getFile();
        Scanner sc = new Scanner(file);

        int count = 0;
        while (sc.hasNextLine()) {
            String wordToCompare = sc.next();
            if(word.equalsIgnoreCase(wordToCompare)){
                count++;
            }
        }
        sc.close();

        System.out.println(count);
        return count;
    }

    public static File getFile() {
        return new File(FILE_NAME);
    }
}
