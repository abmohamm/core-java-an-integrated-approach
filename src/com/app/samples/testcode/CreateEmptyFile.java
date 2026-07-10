package com.app.samples.testcode;

import java.io.File;
import java.io.IOException;

public class CreateEmptyFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("example_empty.txt");
            
            // createNewFile() returns true if a new file is created
            if (myFile.createNewFile()) {
                System.out.println("Empty file created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred during file creation.");
            e.printStackTrace();
        }
    }
}
