package com.debuggeando_ideas.collectors;

import com.debuggeando_ideas.util.Console;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsGroupBy {
    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        Map<Console, List<Videogame>> result =
                videogames.collect(Collectors.groupingBy(Videogame::getConsole));
        result.forEach((k,v) -> System.out.println(k + "-" + v));
    }
}
