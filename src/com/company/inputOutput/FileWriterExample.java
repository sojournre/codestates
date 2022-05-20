package com.company.inputOutput;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            String fileName = "codestates.txt";
            FileWriter writer = new FileWriter(fileName);

            String str = "바보";
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
