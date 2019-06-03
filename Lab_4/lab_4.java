package Lab_4;

import java.util.Arrays;
import java.util.Objects;

class Car implements Comparable<Car> {
    private String name;
    private int year;
    private int top_speed;
    private double speed_100;
    private int prize;

    Car(String name, int year, int top_speed, double speed_100, int prize) {
        this.name = name;
        this.year = year;
        this.top_speed = top_speed;
        this.speed_100 = speed_100;
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Lab_4.Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", top_speed=" + top_speed +
                ", speed_100=" + speed_100 +
                ", prize=" + prize +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(top_speed, prize);
    }

    @Override
    public int compareTo(Car o) {
        int nameComparingResult = Integer.compare(prize, o.prize);
        return nameComparingResult != 0
                ? nameComparingResult
                : Integer.compare(top_speed, o.top_speed);
    }
}

public class lab_4 {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Car("Ford Mustang", 1969, 4, 14.5, 1);
        cars[1] = new Car("Lamborghini 350 GTV", 1963, 3, 34, 1);
        cars[2] = new Car("Ford Mustang", 1967, 2, 30, 3);
        cars[3] = new Car("Ford Mustang", 1967, 1, 30, 4);


        for (Car car : cars) {
            if (car == null) break;
            System.out.println(car);
        }

        Arrays.sort(cars);
        System.out.println("-----------");
        for (Car car : cars) {
            if (car == null) break;
            System.out.println(car);
        }
    }
}