import Interval.*;

import java.time.Duration;

public class Example {
    public static void main(String[] args) {
        Duration intervalDuration = Duration.ofSeconds(10); // Use the Duration class to produce interval times
        Interval repeatingTimer = new Interval(intervalDuration);
        repeatingTimer.addTickListener(() -> System.out.println("I go off every second"));
        repeatingTimer.addResetListener(() -> System.out.println("I go off every 10 seconds"));
        repeatingTimer.addTickListener(new TickListener() {
            @Override
            public void tickAction() {

            }
        });
        repeatingTimer.start();
    }
}
