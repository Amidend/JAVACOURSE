package main.labs.laba8.task1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadInfo {
    public static String Read(String path){
        try (FileInputStream fin = new FileInputStream(path)) {
            Scanner scan = new Scanner(fin);
            System.out.printf("File size: %d bytes \n", fin.available());
            StringBuilder s = new StringBuilder();
            while (scan.hasNextLine()) {
                s.append(scan.nextLine());
            }
            fin.close();
            return s.toString();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return "";
        }
    }
}
