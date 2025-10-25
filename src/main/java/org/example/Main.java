package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        System.out.println(dog.getName() + " says: " + dog.makeSound());
        System.out.println(cat.getName() + " says: " + cat.makeSound());

        Point p = new Point(1.0, 2.0);
        System.out.println("Координати точки: (" + p.getX() + ", " + p.getY() + ")");

        p.moveTo(5.0, 7.0);
        System.out.println("Після переміщення: (" + p.getX() + ", " + p.getY() + ")");

        Smartphone phone = new Smartphone("Ігор", 50.45, 30.52);

        double[] coords = phone.getCoordinates();
        System.out.println("Координати смартфона: Широта " + coords[0] + ", Довгота " + coords[1]);

        phone.makeCall();
        phone.receiveCall();

        phone.setCoordinates(49.84, 24.03);
        coords = phone.getCoordinates();
        System.out.println("Нові координати: Широта " + coords[0] + ", Довгота " + coords[1]);

        Car car1 = new Car(20000, 2018, 150);
        Car car2 = new Car(18000, 2020, 140);
        Car car3 = new Car(20000, 2018, 160);

        System.out.println(car1.compareTo(car2));
        System.out.println(car1.compareTo(car3));
    }
}

