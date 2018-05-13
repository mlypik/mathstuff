package io.github.mlypik;

public class IntMonoid {
    public static Monoid<Integer> intMultiplyingMonoid = new Monoid<>() {
        @Override
        public Integer empty() {
            return 1;
        }

        @Override
        public Integer combine(Integer first, Integer second) {
            return first * second;
        }
    };

    public static Monoid<Integer> intAddingMonoid = new Monoid<>() {
        @Override
        public Integer empty() {
            return 0;
        }

        @Override
        public Integer combine(Integer first, Integer second) {
            return first + second;
        }
    };
}
