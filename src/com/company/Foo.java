package com.company;


class Foo {

    public Foo() {
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
