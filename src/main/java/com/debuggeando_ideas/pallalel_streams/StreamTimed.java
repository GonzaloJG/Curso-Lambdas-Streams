package com.debuggeando_ideas.pallalel_streams;

import java.util.stream.IntStream;

public class StreamTimed {

    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();

        IntStream.rangeClosed(1,200000000).reduce(0, Integer::sum);

        Long endTime = System.currentTimeMillis();

        System.out.println("Total time: " + (endTime - startTime));
    }
}
