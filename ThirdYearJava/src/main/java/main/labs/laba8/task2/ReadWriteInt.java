package main.labs.laba8.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadWriteInt {
    public static void Write(String path){
        Scanner in = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 10; i++){
            System.out.println("Input numbers: ");
            text.append(in.nextInt(10)+"\n");
        }
        try (FileOutputStream fos = new FileOutputStream(path);
             OutputStreamWriter osw = new OutputStreamWriter(fos,
                     StandardCharsets.UTF_8)){
                osw.write(text.toString());
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public static String Read(String path){
        try (FileInputStream fin = new FileInputStream(path)) {
            Scanner scan = new Scanner(fin);
            StringBuilder s = new StringBuilder();
            while (scan.hasNextLine()) {
                s.append(scan.nextLine()).append(" ");
            }
            fin.close();
            String[] str = s.toString().split(" ");
            Integer[] res=new Integer[str.length];
            for (int i=0;i<str.length;i++) {
                res[i]=Integer.valueOf(str[i]);
            }
            int total=0;
            for (Integer re : res) {
                total += re;
            }
            double average = (double)(total) / (double)(res.length);
            return String.valueOf(average);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
            return "";
        }
    }
}
