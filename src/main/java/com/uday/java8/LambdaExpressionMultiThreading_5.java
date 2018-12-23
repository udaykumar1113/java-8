package com.uday.java8;

public class LambdaExpressionMultiThreading_5 {
    public static void main(String args[]){
        Runnable r=()->
        {
          for(int i=0;i<10;i++){
              System.out.println("Child Thread");
          }
        };

        Thread thread_1=new Thread(r);
        thread_1.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }

}
