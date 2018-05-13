package io.github.mlypik;

public interface Monoid<T> extends Semigroup<T>{
    //identity element for the combine operation
    T empty();
}
