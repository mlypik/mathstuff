import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import java.util.function.BiPredicate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assume.assumeTrue;


@RunWith(JUnitQuickcheck.class)
public class EquivalenceRelationTest {

    private BiPredicate<String, String> relationUnderTest = StringSetoid.equivalenceRelation;
//    private BiPredicate<String, String> relationUnderTest = StringSetoid.reflexivePropertyViolation;
//    private BiPredicate<String, String> relationUnderTest = StringSetoid.symmetricPropertyViolation;


    /**
     * ∀ a ∊ S, a ~ a
     *
     * @param a any String
     */
    @Property
    public void reflexivity(String a) {
        assertThat(relationUnderTest.test(a, a)).isTrue();
    }

    /**
     * ∀ a,b ∊ S, a ~ b ⇔ b ~ a
     *
     * @param a any String
     */
    @Property
    public void symmetry(String a, String b) {
        assumeTrue(relationUnderTest.test(a, b));

        assertThat(relationUnderTest.test(b, a)).isTrue();

    }

    /**
     * ∀ a,b,c ∊ S, a ~ b ∧ b ~ c ⇒ a ~ c
     *
     * @param a any String
     */
    @Property
    public void transitivity(String a, String b, String c) {
        assumeTrue(relationUnderTest.test(a, b));
        assumeTrue(relationUnderTest.test(b, c));

        assertThat(relationUnderTest.test(a, c)).isTrue();
    }

}
