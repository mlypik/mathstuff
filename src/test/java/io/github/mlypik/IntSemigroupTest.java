package io.github.mlypik;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static io.github.mlypik.Semi.IntSemigroup;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(JUnitQuickcheck.class)
public class IntSemigroupTest {

    /**
     * Semigroup op must be associative
     */
    @Property
    public void associativity(Integer a, Integer b) {
        assertThat(IntSemigroup.comibine(a, b)).isEqualTo(IntSemigroup.comibine(b, a));

    }
}
