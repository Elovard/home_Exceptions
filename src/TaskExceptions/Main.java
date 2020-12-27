package TaskExceptions;

import TaskExceptions.Car;

public class Main {
    public static void main (String [] args) throws Exception {
        Car Ferrari = new Car("Ferrari", 250, 90000);
        Ferrari.Start();
    }
}
