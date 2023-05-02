package main.labs.laba5.Adapters;

import java.util.Map;

public class MapAdapter {
    public static void printMap(Map map) {
        System.out.println("keySet: " + map.keySet());
    }
    public static void printPets(Map map){
        for (var i:
                map.values()) {
            System.out.println(i);
        }
    }
}
