package io.github.mlypik;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface ListApply extends ListFunctor{
    static <A, B> List<B> ap(List<Function<A, B>> ff, List<A> fa){
        return fa.stream().flatMap(a -> ff.stream().map(e -> e.apply(a))).collect(Collectors.toList());
    }
}
