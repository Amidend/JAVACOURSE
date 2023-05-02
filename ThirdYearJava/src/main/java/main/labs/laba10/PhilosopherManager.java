package main.labs.laba10;

import java.util.LinkedList;
import java.util.List;

public class PhilosopherManager {
    List<Philosopher> philosopherList=new LinkedList<>();
    public PhilosopherManager(){

    }
    public void startTheat(){

    }
    public void add(List<Philosopher> list) {
        philosopherList=list;
    }

    /*public boolean getLeftFolkLeftPhilosopher(Philosopher philosopher){
        int i=
        if(i!=0){
            return i-1;}else {
            return philosopherList.size();
        return false;
    }
    private int findPhilosopher(Philosopher philosopher){
        for(int i=0;i<philosopherList.size();i++){
            if(philosopher== philosopherList.get(i)){
               return i;
                }
            }
        }
        return -1;
    }*/
}
