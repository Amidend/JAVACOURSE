package main.labs.laba8.task4;

import java.io.*;
import java.util.Scanner;

public class L8Task4 {
    Scanner sin = new Scanner(System.in);
    private void Write(String file, double value, boolean append){
        try(FileWriter writer = new FileWriter(file, append))
        {
            writer.write(Double.toString(value));
            writer.append("\n");
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public void DoIt()
    {
        for(int i = 0; i < 15; i++){
            System.out.println("Input number:");
            Write("Temp.txt", sin.nextDouble(), true);
        }
        try(FileReader reader = new FileReader("Temp.txt"))
        {
            int c;
            double results = 0;
            String temp = "";
            while((c=reader.read())!=-1){
                if((char)c != '\n') {
                    temp+=(char)c;
                }
                else{
                    System.out.println(temp);
                    results += Double.valueOf(temp);
                    temp = "";
                }
            }
            System.out.println("Average - "+results/15);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
