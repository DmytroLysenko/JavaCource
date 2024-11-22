package src.main.java.core.module_11;

import java.util.stream.Stream;

public class LinearCongruentialGenerator {
    public static Stream<Long> createLCG(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
