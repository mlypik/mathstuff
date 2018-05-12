package io.github.mlypik;

public class Semi {

    @FunctionalInterface
    interface Semigroup<T>{
        T comibine(T first, T second);
    }

    public static Semigroup<Integer> IntSemigroup = (Integer first, Integer second) -> first + second;
}
