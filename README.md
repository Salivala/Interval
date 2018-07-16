# Interval
Java package that allows for easy creation of intervals with lambda support

## Functions
* provides a simple way to create repeating timers
* built in callback support with lambdas
* No dependencies on non-standard Java libraries

Example
```java
import Interval.*;
public class Example {
    public static void main(String[] args) {
        Duration intervalDuration = Duration.ofSeconds(3); // Use duration class to set interval length
        Interval repeatingTimer = new Interval(intervalDuration);
        
        // Emulates swing component listener behavior
        repeatingTimer.addTickListener(new TickListener() {
            @Override
            public void tickAction() {
                System.out.println("I print every second");
            }
        });
        
        // alternatively, you can just use a lambda
        repeatingTimer.addTickListener(() -> System.out.println("I repeat every second"));
        
        // Interval inherits from Thread
        repeatingTimer.start();
        
    }
}
```
