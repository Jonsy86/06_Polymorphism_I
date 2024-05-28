package com.cc.java;

public class App {
    
    public static void main(String[] args) {
   
        

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();
 
        pollObj(queen);
        pollObj(drone);
        pollObj(worker);


        
    }


    private static void pollObj(Honeybee obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-----------------");
    }


   
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

