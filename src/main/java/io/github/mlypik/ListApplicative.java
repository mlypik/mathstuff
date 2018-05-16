package io.github.mlypik;

import java.util.List;

public interface ListApplicative extends ListApply {
    static <A> List<A> pure(A a){
        return List.of(a);
    }
}
