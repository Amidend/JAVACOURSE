package main.labs.laba5.Adapters;

import java.util.HashMap;

public class ProductAdapter {
    public static void printentrySet(HashMap hashmap) {
        System.out.println("entrySet: " + hashmap.entrySet());
    }
    public static void printvalues(HashMap hashmap) {
        System.out.println("values: " + hashmap.values());
    }
    public static void printkeySet(HashMap hashmap) {
        System.out.println("keySet: " + hashmap.keySet());
    }
}
