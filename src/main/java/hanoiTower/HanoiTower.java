package hanoiTower;

import java.util.Collections;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class HanoiTower {

    static private int SMALLEST_DISK = 1;

    private Peg source = new Peg("SOURCE");
    private Peg aux = new Peg("AUX");
    private Peg destination = new Peg("DESTINATION");
    private MovesExecutor movesExecutor = new MovesExecutor();

    public HanoiTower(int largestDiskSize) {
        initializeSourcePeg(largestDiskSize);
    }

    private void initializeSourcePeg(int largestDiskSize) {
        IntStream.rangeClosed(SMALLEST_DISK,largestDiskSize).boxed().sorted(Collections.reverseOrder()).forEach(i -> {
            source.putOnTop(new Disk(i));
        });
    }



    public void execute(Consumer<String> consumer) {
        int result = moveTower(source.getLargestDisk(), source, destination,aux);
        movesExecutor.showHistory(consumer);
        consumer.accept(Integer.toString(result) + " moves were made");
    }

    private int moveTower(Disk disk, Peg source, Peg destination, Peg aux) {
        int moves = 0;
        if (disk.size == SMALLEST_DISK) {
            movesExecutor.moveDisk(source, destination);
            return 1;
        }
        moves += moveTower(disk.getImmediatelySmaller(),source,aux,destination);
        movesExecutor.moveDisk(source,destination);
        moves++;
        moves += moveTower(disk.getImmediatelySmaller(), aux, destination, source);
        return moves;
    }

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        int largestDiskSize = 0;
        try {
            consumer.accept("Give the largest disk size: ");
            largestDiskSize = Integer.valueOf(new Scanner(System.in).next());
        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        HanoiTower hanoiTowerSolution = new HanoiTower(largestDiskSize);
        hanoiTowerSolution.execute(consumer);
    }

}
