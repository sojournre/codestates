package com.company.inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("codestates.txt");
//            String path = System.getProperty("user.dir"); System.out.println("현재 작업 경로: " + path);

            int i = 0;
            while ((i = fileInput.read()) != -1) {
                System.out.print((char)i);
            }
            fileInput.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
