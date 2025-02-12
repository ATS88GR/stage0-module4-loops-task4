package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < 0) System.out.println("last number in row is negative");
        else if (numberToSkip > lastInRow) System.out.println("number to skip is bigger then the last");
        else {
            int sum = 0;
            int skippedSum = 0;
            for (int count = 0; count <= lastInRow; count++) {
                if (count <= numberToSkip) skippedSum += count;
                else sum += count;
            }
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + sum);
        }
    }
}
