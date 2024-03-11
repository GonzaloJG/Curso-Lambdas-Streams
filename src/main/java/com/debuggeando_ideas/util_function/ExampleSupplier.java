package com.debuggeando_ideas.util_function;

import java.util.Random;
import java.util.function.Supplier;

public class ExampleSupplier {

    static Supplier<Integer> randomInt= () -> new Random().nextInt(100);
    static Supplier<MyProduct> productSupplier= () -> new MyProduct(100, "product");

    public static void main(String[] args) {
        System.out.println(randomInt.get());
        System.out.println(randomInt.get());
        System.out.println(randomInt.get());

        System.out.println(productSupplier.get());
    }

}
