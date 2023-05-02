package main.labs.laba8.task5;

import java.io.*;
import java.util.Scanner;

public class Lab8Task5 {
    Scanner sin = new Scanner(System.in);
    private void Write(String file, int value, boolean append){
        try(FileWriter writer = new FileWriter(file, append))
        {
            writer.write(String.valueOf(value));
            writer.append("\n");
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public void DoIt()
    {
        for(int i = 0; i < 10; i++){
            System.out.println("Input number:");
            Write("f.txt", sin.nextInt(), true);
        }
        try(FileReader reader = new FileReader("f.txt"))
        {
            int c;
            int results = 0;
            String temp = "";
            while((c=reader.read())!=-1){
                if((char)c != '\n') {
                    temp+=(char)c;
                }
                else{
                    if(Integer.valueOf(temp) > 0){
                        results++;
                    }
                    temp = "";
                }
            }
            System.out.println("Plus - "+results);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
