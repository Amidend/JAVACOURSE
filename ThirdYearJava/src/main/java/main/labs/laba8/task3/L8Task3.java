package main.labs.laba8.task3;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class L8Task3 {
    private static void appendUsingOutputStream(String fileName, String data) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File(fileName), true);
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void Write(String path){
        Random rand = new Random();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 10; i++){
            text.append(rand.nextInt(100)+"\n");
        }
        try (FileOutputStream fos = new FileOutputStream(path+"\\f.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos,
                     StandardCharsets.UTF_8)){
            osw.write(text.toString());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void Calculate(String path){
        Write(path); Integer[] result = new Integer[10];
        try (FileInputStream fin = new FileInputStream(path+"\\f.txt")) {
            Scanner scan = new Scanner(fin);
            scan.close();
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
            result= new Integer[res.length];
            System.arraycopy(res, 0, result, 0, res.length);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        try(FileReader reader = new FileReader(path+"\\f.txt"))
        {
            for (Integer integer : result) {
                if (integer % 2 == 0) {
                    appendUsingOutputStream( path + "\\g.txt",integer.toString()+" ");
                } else {
                    appendUsingOutputStream(path + "\\h.txt",integer.toString()+" ");
                }
            }
        }

        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
