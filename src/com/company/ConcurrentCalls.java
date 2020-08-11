package com.company;


import java.util.function.Consumer;

class ConcurrentCalls {

    public static void main(String[] args) {
        ConcurrentCalls concurrentCalls = new ConcurrentCalls();

        Consumer<Runnable> asyncStarter = runnable -> new Thread(runnable).start();

        asyncStarter.accept(() -> concurrentCalls.second(() -> System.out.println("second")));
        asyncStarter.accept(() -> concurrentCalls.first(() -> System.out.println("first")));
        asyncStarter.accept(() -> concurrentCalls.third(() -> System.out.println("third")));
    }

    public ConcurrentCalls() {
    }

    public void first(Runnable printFirst) {
        printFirst.run();
    }

    public void second(Runnable printSecond) {
        printSecond.run();
    }

    public void third(Runnable printThird) {
        printThird.run();
    }
}
