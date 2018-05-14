package io.github.mlypik;

import java.util.Optional;
import java.util.function.Function;

//Seems worthless, since there are no higher-king generics, and no idea for workaround
//Functor[F[_]] - how to do that in Java?
public interface OptionFunctor {
    static <A, B> Optional<B> map(Optional<A> fa, Function<A, B> f){
        if(fa.isPresent()){
            return fa.map(f);
        } else{
            return Optional.empty();
        }
    }

    static <A, B> Function<Optional<A>, Optional<B>> lift(Function<A, B> f){
        return (fa -> map(fa, f));
    }
}
