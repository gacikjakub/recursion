package hanoiTower;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class MovesExecutor {


    private List<String> movesHistory = new LinkedList<>();

    public boolean moveDisk(Peg source, Peg destination) {
        Optional<Disk> cache = source.getTop();
        if (!cache.isPresent()) {
            return false;
        }
        try {
            if (!destination.putOnTop(cache.get())) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            source.putOnTop(cache.get());
            return false;
        }
        movesHistory.add("From " + source.name + " ----> " + destination.name + ": Disk " + cache.get());
        return true;
    }

    public void showHistory(Consumer<String> consumer) {
        consumer.accept("MOVES HISTORY: ");
        StringBuilder stringBuilder = new StringBuilder();
        final AtomicInteger counter = new AtomicInteger(0);
        movesHistory.stream().forEach(s -> {
            stringBuilder.append(counter.incrementAndGet() + ". ").append(s).append("\n");
        });
        consumer.accept(stringBuilder.toString());
    }
}