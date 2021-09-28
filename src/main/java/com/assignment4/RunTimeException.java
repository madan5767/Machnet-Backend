package com.assignment4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RunTimeException {

    public static void main(String[] args) throws IOException {
                FileReader file = null;
                try {
                    file = new FileReader("source.txt");
                    file.read();
                }
                catch(FileNotFoundException e) {
                    System.out.println("File Not Exist");
                }
                finally {
                    System.out.println("Finally block executed");
                }
    }
}
