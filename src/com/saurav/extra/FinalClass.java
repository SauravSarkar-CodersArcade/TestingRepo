package com.saurav.extra;

final class Bikers{}

class Honda1 extends Bikers{
    void run(){System.out.println("running safely with 100kmph");}

    public static void main(String args[]){
        Honda1 honda= new Honda1();
        honda.run();
    }
}
