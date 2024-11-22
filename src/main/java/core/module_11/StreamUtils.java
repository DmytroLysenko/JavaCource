package src.main.java.core.module_11;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.Spliterator;
import java.util.Spliterators;

public class StreamUtils {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Iterator<T> zippedIterator = new Iterator<>() {
            private boolean useFirst = true; // Alternate between streams

            @Override
            public boolean hasNext() {
                // Stop when either stream runs out of elements
                return firstIterator.hasNext() && secondIterator.hasNext();
            }

            @Override
            public T next() {
                if (useFirst) {
                    useFirst = false;
                    return firstIterator.next();
                } else {
                    useFirst = true;
                    return secondIterator.next();
                }
            }
        };

        Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(zippedIterator, Spliterator.ORDERED);
        return StreamSupport.stream(spliterator, false);
    }

}
