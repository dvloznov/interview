package com.company;

public class Main {

    public static void main(String[] args) {
	    Foo foo = new Foo();

        runAsync(() -> foo.second(() -> System.out.println("second")));
        runAsync(() -> foo.first(() -> System.out.println("first")));
        runAsync(() -> foo.third(() -> System.out.println("third")));
    }

    private static void runAsync(Runnable runnable) {
        new Thread(runnable).start();
    }
}
