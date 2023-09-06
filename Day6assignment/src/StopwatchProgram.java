import java.util.Scanner;
public class StopwatchProgram {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started.");
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        System.out.println("Stopwatch stopped.");
    }

    public void calculateElapsedTime() {
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }

    public static void main(String[] args) {
        StopwatchProgram stopwatch = new StopwatchProgram();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press ENTER to start the stopwatch...");
        scanner.nextLine();
        stopwatch.start();

        System.out.println("Press ENTER to stop the stopwatch...");
        scanner.nextLine();
        stopwatch.stop();

        stopwatch.calculateElapsedTime();

        scanner.close();
    }
}