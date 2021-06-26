import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final Random random;
    private final Integer min;
    private final Integer max;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(max - min + 1) + min;
            }
        };
    }

}