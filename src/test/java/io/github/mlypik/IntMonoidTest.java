package io.github.mlypik;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static io.github.mlypik.IntMonoid.intMultiplyingMonoid;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(JUnitQuickcheck.class)
public class IntMonoidTest {

    @Property
    public void associativity(Integer a, Integer b) {
        assertThat(intMultiplyingMonoid.combine(a, b)).isEqualTo(intMultiplyingMonoid.combine(b, a));
    }

    /**
     * combine(x, empty) = combine(empty, x) = x
     */
    @Property
    public void idOfEmpty(Integer x) {
        assertThat(
                intMultiplyingMonoid.combine(x, intMultiplyingMonoid.empty())).isEqualTo(
                intMultiplyingMonoid.combine(intMultiplyingMonoid.empty(), x)).isEqualTo(
                x
        );

    }
}
