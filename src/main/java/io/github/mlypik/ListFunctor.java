package io.github.mlypik;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface ListFunctor {
    static <A, B> List<B> map(List<A> fa, Function<A, B> f){
        return fa.stream().map(f).collect(Collectors.toList());
    }

    static <A, B> Function<List<A>, List<B>> lift(Function<A, B> f){
        return (fa -> map(fa, f));
    }
}
