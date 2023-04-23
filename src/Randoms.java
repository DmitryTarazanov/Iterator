package src;

import java.util.Iterator;

public class Randoms implements Iterable<Integer>{
    private EnrichedIterator enrichedIterator;

    public Randoms(int min, int max) {
        enrichedIterator = new EnrichedIterator(min, max);
    }


    @Override
    public Iterator<Integer> iterator() {
        return enrichedIterator;
    }
}
