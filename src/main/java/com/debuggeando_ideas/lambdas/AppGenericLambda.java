package com.debuggeando_ideas.lambdas;

import com.debuggeando_ideas.fundamentals.Product;

public class AppGenericLambda {

    public static void main(String[] args) {
        Printer<String> printString = string -> System.out.println(string);
        Printer<Product> printProduct = product -> System.out.println(product);

        printString.print("Hola mundo");

        Product product = new Product();
        product.setId(1L);
        product.setName("producto");
        product.setPrice(10d);
        printProduct.print(product);
    }
}
