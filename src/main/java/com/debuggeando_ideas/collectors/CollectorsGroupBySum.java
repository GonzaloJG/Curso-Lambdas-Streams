package com.debuggeando_ideas.collectors;

import com.debuggeando_ideas.util.Console;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsGroupBySum {
    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        Map<Console, Integer> result =
                videogames.collect(Collectors.groupingBy(
                        Videogame::getConsole,
                        Collectors.summingInt(Videogame::getTotalSold)));

        result.forEach((k,v) -> System.out.println(k + "-" + v));

    }
}
