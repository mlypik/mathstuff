package io.github.mlypik;

import java.util.function.BiPredicate;

public class StringSetoid {

    /**
     * (String, equals)
     * equals method as an equivalence relation over String
     */
    public static BiPredicate<String, String> equivalenceRelation = String::equals;

    public static BiPredicate<String, String> reflexivePropertyViolation = (s1, s2) -> s1.equals(s2.toLowerCase());

    public static BiPredicate<String, String> symmetricPropertyViolation = (s1, s2) -> s1.length() >= s2.length();
}
