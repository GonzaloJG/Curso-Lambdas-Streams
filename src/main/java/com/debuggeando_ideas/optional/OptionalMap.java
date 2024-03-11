package com.debuggeando_ideas.optional;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Optional;

public class OptionalMap {
    public static void main(String[] args) {
        Optional<Videogame> gtaOpt = Optional.of(Database.videogames.get(5));
        String website = gtaOpt.map(v -> "The official website is " + v.getOfficialWebsite())
                .orElseThrow(RuntimeException::new);

        System.out.println(website);

    }
}
