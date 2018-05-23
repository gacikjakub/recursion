package hanoiTower;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.LinkedBlockingDeque;

public class Peg {


    public final String name;

    private Deque<Disk> stack = new LinkedBlockingDeque<>();


    public Peg(String name) {
        this.name = name;
    }

    public Optional<Disk> getTop() {
        return Optional.ofNullable(stack.pollFirst());
    }

    public boolean putOnTop(Disk disk) {
        if (stack.contains(disk)) {
            return false;
        }
        return stack.offerFirst(disk);
    }



}
