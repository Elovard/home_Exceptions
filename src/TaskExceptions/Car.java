package TaskExceptions;

import java.util.Scanner;


public class Car {
    private String brand;
    private int speed;
    private int price;
    public double number;


    Scanner scan = new Scanner(System.in);

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public void Start () throws MyException {
        try {
            number = Math.random();
            number = number * 20;
            number = Math.round(number);
            if (number % 2 == 0) {
                throw new MyException("Выпло четное число, машина не завелась");
            } else {
                System.out.println("Машина " + this.brand + " завелась!");
            }
        }


        finally {
      //      while (number % 2 == 0)
      //      Start();

            System.out.println("Your number was: " + number);
        }
    }

}
