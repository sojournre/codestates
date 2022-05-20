package com.company.inputOutput;

import java.io.File;
import java.io.IOException;

public class FileCalssExample {
    public static void main(String[] args) throws IOException {
        File file = new File("./", "new.txt");
        file.createNewFile();
        File parentDir = new File("./");
        File[] list = parentDir.listFiles();

        String prefix = "code";

        for (int i = 0; i < list.length; i++) {
            String fileName = list[i].getName();

            if (fileName.endsWith("txt") && !fileName.startsWith("code")) {
                list[i].renameTo(new File(parentDir, prefix + fileName));
            }
        }
    }
}
