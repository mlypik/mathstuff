package io.github.mlypik;

interface Semigroup<T>{
    //associative binary operation
    T combine(T first, T second);
}
