package org.example;

public class Car implements Comparable {
    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    // Реалізація методу compareTo
    @Override
    public int compareTo(Object obj) {
        if (!(obj instanceof Car)) {
            throw new IllegalArgumentException("Порівнювати можна тільки з Car");
        }

        Car other = (Car) obj;

        if (this.price != other.price) {
            return other.price - this.price;
        }

        if (this.year != other.year) {
            return this.year - other.year;
        }

        return this.horsePower - other.horsePower;
    }
}