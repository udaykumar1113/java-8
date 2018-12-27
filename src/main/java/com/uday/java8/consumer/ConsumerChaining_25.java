package com.uday.java8.consumer;

import java.util.function.Consumer;

public class ConsumerChaining_25 {
    public static void main(String args[]){
        Consumer<String> consumer_1 = s->System.out.println("Priniting first consumer "+s);
        Consumer<String> consumer_2 = s->System.out.println("Priniting second consumer "+s);
        Consumer<String> consumer_3 = s->System.out.println("Priniting third consumer "+s);

        Consumer<String> consumer =consumer_3.andThen(consumer_2).andThen(consumer_1);

        consumer.accept("main consumer");
    }
}
