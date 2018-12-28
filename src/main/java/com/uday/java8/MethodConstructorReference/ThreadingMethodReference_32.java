package com.uday.java8.MethodConstructorReference;

class ThreadRef{

    public void runAlternative(){
        for(int i=0;i<10;i++){
            System.out.println("Printed by child thread "+i);
        }
    }
}
public class ThreadingMethodReference_32 {

    public static void main(String args[]){
        ThreadRef threadRef=new ThreadRef();
        Runnable runnable=threadRef::runAlternative;
        Thread thread=new Thread(runnable);
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println("Printed by main thread "+i);
        }
    }
}
