package src.main.java.core.module_11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] arg) {
        // TASK 1
        List<String> names = Arrays.asList("Ivan", "Dmytro", "Peter", "John", "Solomiya", "Yana", "Makar");
        String result = IntStream.range(0, names.size()).filter((index) -> index % 2 == 0)
                .mapToObj(index -> "" + (index + 1) + ". " + names.get(index)).collect(Collectors.joining(", "));
        System.out.println(result);

        // TASK 2
        System.out.println(names.stream().map(name -> name.toUpperCase()).sorted(Collections.reverseOrder()).toList());

        // TASK 3
        List<String> arr = Arrays.asList("1, 2, 0", "4, 5");
        String sortedNumbersString = Arrays.asList(
                arr.stream().map(item -> item.replaceAll("\\s+", "")).collect(Collectors.joining(",")).split(","))
                .stream().sorted().collect(Collectors.joining(", "));
        System.out.println(sortedNumbersString);

        // TASK 4
        long a = 25214903917L;
        long c = 11L;
        long m = 1L << 48; // 2^48 (shift expression 1 << exponent)
        long seed = 12345L;

        Stream<Long> randomNumbers = LinearCongruentialGenerator.createLCG(seed, a, c, m);

        // Print the first 10 random numbers
        randomNumbers.limit(10).forEach(System.out::println);

        // TASK 5

        Stream<Integer> stream1 = Stream.of(1, 3, 5, 7);
        Stream<Integer> stream2 = Stream.of(2, 4, 6);

        Stream<Integer> zippedStream = StreamUtils.zip(stream1, stream2);
        zippedStream.forEach(System.out::println); // Outputs: 1, 2, 3, 4, 5, 6

    }

}
