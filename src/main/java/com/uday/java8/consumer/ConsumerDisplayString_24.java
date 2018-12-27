package com.uday.java8.consumer;

import java.util.function.Consumer;

public class ConsumerDisplayString_24 {
    public static void main(String args[]){
        Consumer<String> consumer=s->System.out.println(s);
        consumer.accept("This is displayed using consumer");
    }
}
