package com.mania.java.lambda;

@FunctionalInterface
interface Baz {
    String method(String string);
    default String defaultBaz() {return null;}
    default String defaultCommon(){return null;}
}

@FunctionalInterface
interface Bar {
    String method(String string);
    default String defaultBar() {return null;}
    default String defaultCommon(){return null;}
}

@FunctionalInterface
public interface FooExtended extends Baz, Bar {
    @Override
    default String defaultCommon() {
        return Bar.super.defaultCommon();
    }
}


