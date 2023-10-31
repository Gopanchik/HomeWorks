package lesson9;

class Vehicle {
    double price;
    int speed;
    int year;
    String name;

    public Vehicle(double price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }
}

class Plane extends Vehicle {
    int numOfPassenger;

    public Plane(double price, int speed, int year, String name, int numOfPassenger) {
        super(price, speed, year);
        this.name = name;
        this.numOfPassenger = numOfPassenger;
    }

    public void displayInfo() {
        System.out.println("Назва літака: " + name);
        System.out.println("Кількість пасажирів: " + numOfPassenger);
    }
}

class Car extends Vehicle {
    int id;
    String color;
    int numOfDoor;

    public Car(double price, int speed, int year, int id, String name, String color, int numOfDoor) {
        super(price, speed, year);
        this.id = id;
        this.name = name;
        this.color = color;
        this.numOfDoor = numOfDoor;
    }

    public void displayInfo() {
        System.out.println("ID автомобіля: " + id);
        System.out.println("Назва автомобіля: " + name);
        System.out.println("Колір автомобіля: " + color);
        System.out.println("Кількість дверей: " + numOfDoor);
    }
}

class Ship extends Vehicle {
    int numOfPassenger;
    String description;

    public Ship(double price, int speed, int year, String name, int numOfPassenger, String description) {
        super(price, speed, year);
        this.name = name;
        this.numOfPassenger = numOfPassenger;
        this.description = description;
    }
}

class First {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(50000, 120, 2020);
        Plane plane = new Plane(1000000, 800, 2010, "Ultra 440b", 400);
        Car car = new Car(30000, 150, 2022, 12345, "Kia", "Grey", 4);
        Ship ship = new Ship(2000000, 30, 2015, "Gambit 23h", 2500, "Чудовий,зручний корабель. ");

        System.out.println("Інформація про транспортні засоби:");
        System.out.println("Транспортний засіб:");
        System.out.println("\nЛітак:");
        plane.displayInfo();
        System.out.println("\nАвтомобіль:");
        car.displayInfo();
        System.out.println("\nКорабель:");
    }
}
