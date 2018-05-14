package io.github.mlypik;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ListFunctorTest {

    @Test
    public void functorCanMap(){
        var stringList = List.of("a", "ab", "abc");

        var stringLengths = ListFunctor.map(stringList, String::length);

        assertThat(stringLengths).isEqualTo(List.of(1, 2, 3));
    }

    @Test
    public void functorCanLift(){
        var stringList = List.of("a", "ab", "abc");

        var stringLengths = ListFunctor.lift(String::length).apply(stringList);

        assertThat(stringLengths).isEqualTo(List.of(1, 2, 3));
    }
}
