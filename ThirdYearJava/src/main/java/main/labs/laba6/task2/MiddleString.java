package main.labs.laba6.task2;

public abstract class MiddleString {
    public static String findMiddleString(String str){
        return String.valueOf(str.charAt(str.length()/2-1))+String.valueOf(str.charAt((str.length()/2)));
    }
}
